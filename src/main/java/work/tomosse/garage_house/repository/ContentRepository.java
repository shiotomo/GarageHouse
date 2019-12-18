package work.tomosse.garage_house.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import work.tomosse.garage_house.mapper.ContentMapper;
import work.tomosse.garage_house.mapper.extension.ContentExtensionMapper;
import work.tomosse.garage_house.model.db.Content;

@Repository
public class ContentRepository {

    @Autowired
    ContentMapper contentMapper;

    @Autowired
    ContentExtensionMapper contentExtensionMapper;

    /**
     * ContentDataに紐付いたContentを取得する
     *
     * @param contentDataId
     * @return
     */
    public List<Content> selectByContentDataId(final Long contentDataId) {
        return contentExtensionMapper.selectByContentDataId(contentDataId);
    }

    /**
     * contentを作成する
     *
     * @param content
     * @return
     */
    public int insert(final Content content) {
        return contentMapper.insert(content);
    }
}
