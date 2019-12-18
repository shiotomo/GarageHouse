package work.tomosse.garage_house.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import work.tomosse.garage_house.mapper.ContentMapper;
import work.tomosse.garage_house.model.db.Content;

@Repository
public class ContentRepository {

    @Autowired
    ContentMapper contentMapper;

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
