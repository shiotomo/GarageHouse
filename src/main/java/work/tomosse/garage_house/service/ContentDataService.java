package work.tomosse.garage_house.service;

import java.security.Principal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work.tomosse.garage_house.logic.ContentDataLogic;
import work.tomosse.garage_house.logic.ContentLogic;
import work.tomosse.garage_house.model.db.ContentData;
import work.tomosse.garage_house.model.request.ContentDataRequest;
import work.tomosse.garage_house.repository.AccountRepository;
import work.tomosse.garage_house.repository.ColumnManageRepository;
import work.tomosse.garage_house.repository.ContentDataRepository;
import work.tomosse.garage_house.repository.ContentRepository;
import work.tomosse.garage_house.repository.ProductRepository;
import work.tomosse.garage_house.util.ColumnTypeUtils;

@Service
public class ContentDataService {

    @Autowired
    ContentDataLogic contentDataLogic;

    @Autowired
    ContentLogic contentLogic;

    @Autowired
    ColumnTypeUtils columnTypeUtils;

    @Autowired
    ContentDataRepository contentDataRepository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    ColumnManageRepository columnManageRepository;

    @Autowired
    ContentRepository contentRepository;

    @Autowired
    ProductRepository productRepository;

    /**
     * 指定したproductIdに紐付いたcontent_dataを取得する
     *
     * @param productId
     * @return
     */
    public List<Map<Long, ContentData>> selectByProductId(final Long productId) {
        return null;
    }

    /**
     * content_dataを作成する
     *
     * @param principal
     * @param productId
     * @param contentDataRequest
     */
    public void createContentData(final Principal principal, final Long productId, final ContentDataRequest contentDataRequest) {
        final var account = accountRepository.selectByName(principal.getName());
        final var columnManageList = columnManageRepository.selectByProductId(productId);
        final var columnNameAndTypeMap = new HashMap<String, Object>();
        final var columnNameAndIdMap = new HashMap<String, Long>();
        columnManageList.forEach(columnManage -> {
            columnNameAndTypeMap.put(columnManage.getName(), columnManage.getColumnType());
            columnNameAndIdMap.put(columnManage.getName(), columnManage.getId());
        });

        // リクエストされたデータのvalidationを行う
        contentDataRequest.getContentDataMap().forEach((key, value) -> {
            final var columnType = columnNameAndTypeMap.get(key).toString();
            columnTypeUtils.columnTypeValidation(columnType, value);
        });

        // content_dataを作成する
        final var contentData = contentDataLogic.createContentDataModel(account.getId(), productId, contentDataRequest);
        contentDataRepository.insertReturnId(contentData);

        // contentを作成する
        // TODO バルクインサートに変更する
        contentDataRequest.getContentDataMap().forEach((key, value) -> {
            final var columnManageId = columnNameAndIdMap.get(key);
            final var content = contentLogic.createContentModel(account.getId(), contentData.getId(), columnManageId, value);
            contentRepository.insert(content);
        });
    }

    /**
     * productに紐付いているcontentMapを返却する
     * Map<contentDataId, Map<columnName, content.Body>>の構造が返却される
     *
     * @param productId
     * @return
     */
    public Map<Long, Map<String, Object>> getContentMap(final Long productId) {
        final var columnManageList = columnManageRepository.selectByProductId(productId);
        final var contentDataList = contentDataRepository.selectByProductId(productId);
        final var contentMap = new HashMap<Long, Map<String, Object>>();
        final var columnNameMap = new HashMap<Long, String>();
        columnManageList.forEach(columnManage -> {
            columnNameMap.put(columnManage.getId(), columnManage.getName());
        });
        contentDataList.forEach(contentData -> {
            final var contentDataId = contentData.getId();
            if (!contentMap.containsKey(contentDataId)) {
                contentMap.put(contentDataId, new HashMap<String, Object>());
            }
            final var contentList = contentRepository.selectByContentDataId(contentDataId);
            contentList.forEach(content -> {
                contentMap.get(contentDataId).put(columnNameMap.get(content.getColumnManageId()), content.getBody());
            });
        });
        return contentMap;
    }

    /**
     * content_dataを削除する
     *
     * @param contentId
     */
    public void delete(final Long contentDataId) {
        contentRepository.deleteByContentId(contentDataId);
        contentDataRepository.deleteByContentId(contentDataId);
    }
}
