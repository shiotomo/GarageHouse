package work.tomosse.garage_house.mapper.extension;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import work.tomosse.garage_house.model.db.Content;

@Mapper
public interface ContentExtensionMapper {

    public List<Content> selectByContentDataId(Long contentDataId);

    /**
     * contentをバルクインサートする
     *
     * @param contentList
     * @return
     */
    public int multiInsert(List<Content> contentList);
}
