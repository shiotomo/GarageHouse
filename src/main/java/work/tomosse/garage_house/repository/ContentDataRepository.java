package work.tomosse.garage_house.repository;

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

}
