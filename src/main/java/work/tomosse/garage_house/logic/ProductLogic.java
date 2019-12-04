package work.tomosse.garage_house.logic;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import work.tomosse.garage_house.enums.ErrorCode;
import work.tomosse.garage_house.exception.GarageHouseBadRequestException;
import work.tomosse.garage_house.model.db.Product;
import work.tomosse.garage_house.model.request.ProductRequest;
import work.tomosse.garage_house.repository.ProductRepository;

@Component
public class ProductLogic {

    @Autowired
    ProductRepository productRepository;

    /**
     * productを作成する
     *
     * @param name
     * @return
     */
    public Product createProduct(final String name) {
        final var productRecord = productRepository.selectByName(name);
        if (productRecord != null) {
            throw new GarageHouseBadRequestException(ErrorCode.ConflictProduct, name);
        }
        final var product = new Product();
        product.setName(name);
        product.setCreated_at(new Date());
        product.setUpdated_at(new Date());
        // TODO accountのidを入れれるようにする
        product.setCreated_by(1L);
        product.setUpdated_by(1L);
        productRepository.insert(product);
        return productRepository.selectByName(name);
    }

    /**
     * productを更新する
     *
     * @param product
     * @param productRequest
     * @return
     */
    public void updateProduct(final Product product, final ProductRequest productRequest) {
        product.setName(productRequest.getName());
        // TODO accountのidを入れれるようにする
        product.setUpdated_at(new Date());
        product.setUpdated_by(1L);
        productRepository.update(product);
    }

}
