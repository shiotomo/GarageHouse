package work.tomosse.garage_house.logic;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work.tomosse.garage_house.mapper.ContentMapper;
import work.tomosse.garage_house.model.db.Content;

@Service
public class ContentLogic {

    @Autowired
    ContentMapper contentMapper;

    /**
     * Content Modelを作成する
     *
     * @param accountId
     * @param contentDataId
     * @param columnManageId
     * @param body
     * @return
     */
    public Content createContentModel(final Long accountId, final Long contentDataId, final Long columnManageId, final Object body) {
        final var content = new Content();
        content.setContentDataId(contentDataId);
        content.setColumnManageId(columnManageId);
        content.setBody(body.toString());
        content.setCreatedBy(accountId);
        content.setUpdatedBy(accountId);
        content.setCreatedAt(new Date());
        content.setUpdatedAt(new Date());
        return content;
    }
}
