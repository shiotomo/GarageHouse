package work.tomosse.logic;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import work.tomosse.model.db.Product;
import work.tomosse.repository.ProductRepository;

@Component
public class ProductLogic {

    @Autowired
    ProductRepository productRepository;

    public Product createProduct(final String name) {
        final var product = new Product();
        product.setName(name);
        product.setCreated_at(new Date());
        product.setUpdated_at(new Date());
        product.setCreated_by(1L);
        product.setUpdated_by(1L);
        final var code = productRepository.insert(product);
        return productRepository.selectByName(name);
    }

}
