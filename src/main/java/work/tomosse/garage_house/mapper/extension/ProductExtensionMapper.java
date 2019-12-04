package work.tomosse.garage_house.mapper.extension;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import work.tomosse.garage_house.model.db.Product;

@Mapper
public interface ProductExtensionMapper {

    /**
     * 指定したnameを持つproductを取得する
     * nameはユニークなので1つのProductが返却される
     *
     * @param name
     * @return
     */
    public Product selectByName(@Param("name") String name);

    /**
     * accountに紐付いたproductを取得する
     *
     * @param accountId
     * @return
     */
    public List<Product> selectByAccount(@Param("accountId") Long accountId);
}
