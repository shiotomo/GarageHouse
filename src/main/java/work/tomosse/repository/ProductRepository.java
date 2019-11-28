package work.tomosse.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import work.tomosse.mapper.ProductMapper;
import work.tomosse.model.db.Product;
import work.tomosse.model.db.ProductExample;

@Repository
public class ProductRepository {

    @Autowired
    ProductMapper productMapper;

    /**
     * productのリストを返却する
     *
     * @return
     */
    public List<Product> selectAll() {
        final var example = new ProductExample();
        return productMapper.selectByExample(example);
    }

}
