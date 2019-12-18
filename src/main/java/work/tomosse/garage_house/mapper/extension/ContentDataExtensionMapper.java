package work.tomosse.garage_house.mapper.extension;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import work.tomosse.garage_house.model.db.ContentData;

@Mapper
public interface ContentDataExtensionMapper {

    /**
     * productIdを持つcontent_dataを取得する
     *
     * @param productId
     * @return
     */
    public List<ContentData> selectByProductId(Long productId);

    /**
     * content_dataを作成しidを返却する
     *
     * @param contentData
     * @return
     */
    public Long insertReturnId(ContentData contentData);
}
