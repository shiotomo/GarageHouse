package work.tomosse.garage_house.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import work.tomosse.garage_house.mapper.ContentDataMapper;
import work.tomosse.garage_house.mapper.extension.ContentDataExtensionMapper;
import work.tomosse.garage_house.model.db.ContentData;

@Repository
public class ContentDataRepository {

    @Autowired
    ContentDataMapper contentDataMapper;

    @Autowired
    ContentDataExtensionMapper contentDataExtensionMapper;

    /**
     * productIdに紐付いたcontent_dataのリストを取得する
     *
     * @param productId
     * @return
     */
    public List<ContentData> selectByProductId(final Long productId) {
        return contentDataExtensionMapper.selectByProductId(productId);
    }

    /**
     * content_dataを作成する
     *
     * @param contentData
     * @return
     */
    public int insert(final ContentData contentData) {
        return contentDataMapper.insert(contentData);
    }

    /**
     * content_dataを作成し、idを返却する
     *
     * @param contentData
     * @return
     */
    public Long insertReturnId(final ContentData contentData) {
        return contentDataExtensionMapper.insertReturnId(contentData);
    }

    /**
     * content_dataを削除する
     *
     * @param contentId
     */
    public void deleteByContentId(final Long contentId) {
        contentDataMapper.deleteByPrimaryKey(contentId);
    }
}
