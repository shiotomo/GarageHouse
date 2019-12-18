package work.tomosse.garage_house.logic;

import java.util.Date;

import org.springframework.stereotype.Component;

import work.tomosse.garage_house.model.db.ContentData;
import work.tomosse.garage_house.model.request.ContentDataRequest;

@Component
public class ContentDataLogic {

    /**
     * ContentDataを作成する
     *
     * @param accountId
     * @param productId
     * @param contentDataRequest
     * @return
     */
    public ContentData createContentDataModel(final Long accountId, final Long productId, final ContentDataRequest contentDataRequest) {
        final var contentData = new ContentData();
        contentData.setProductId(productId);
        contentData.setCreatedBy(accountId);
        contentData.setUpdatedBy(accountId);
        contentData.setCreatedAt(new Date());
        contentData.setUpdatedAt(new Date());
        return contentData;
    }

}
