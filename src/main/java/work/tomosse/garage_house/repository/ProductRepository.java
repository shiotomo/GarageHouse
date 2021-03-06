package work.tomosse.garage_house.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import work.tomosse.garage_house.mapper.ProductMapper;
import work.tomosse.garage_house.mapper.extension.ProductExtensionMapper;
import work.tomosse.garage_house.model.db.Product;
import work.tomosse.garage_house.model.db.ProductExample;

@Repository
public class ProductRepository {

    @Autowired
    ProductMapper productMapper;

    @Autowired
    ProductExtensionMapper productExtensionMapper;

    /**
     * productのリストを返却する
     *
     * @return
     */
    public List<Product> selectAll() {
        final var example = new ProductExample();
        return productMapper.selectByExample(example);
    }

    /**
     * productの数を返却する
     *
     * @return
     */
    public Long count() {
        final var example = new ProductExample();
        return productMapper.countByExample(example);
    }

    /**
     * 指定したIDのproductを返却する
     *
     * @param id
     * @return
     */
    public Product selectById(final Long id) {
        return productMapper.selectByPrimaryKey(id);
    }

    /**
     * 指定したnameのproductを返却する
     *
     * @param id
     * @return
     */
    public Product selectByName(final String name) {
        return productExtensionMapper.selectByName(name);
    }

    /**
     * productを作成する
     *
     * @param product
     */
    public int insert(final Product product) {
        return productMapper.insert(product);
    }

    /**
     * productを更新する
     *
     * @param id
     * @param product
     * @return
     */
    public int update(final Product product) {
        return productMapper.updateByPrimaryKey(product);
    }

    /**
     * productを削除する
     *
     * @param id
     */
    public void deleteById(final Long id) {
        productMapper.deleteByPrimaryKey(id);
    }

    /**
     * account_productに紐付いたproductを取得する
     *
     * @param accountProductList
     * @return
     */
    public List<Product> selectByAccount(final Long accountId) {
        return productExtensionMapper.selectByAccount(accountId);
    }
}
