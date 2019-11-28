package work.tomosse.mapper.extension;

import org.apache.ibatis.annotations.Mapper;

import work.tomosse.model.db.Product;

@Mapper
public interface ProductExtensionMapper {

    /**
     * 指定したnameを持つproductを取得する
     * nameはユニークなので1つのProductが返却される
     *
     * @param name
     * @return
     */
    public Product selectByName(String name);
}