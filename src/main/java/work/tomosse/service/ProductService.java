package work.tomosse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work.tomosse.enums.ErrorCode;
import work.tomosse.exception.GarageHouseBadRequestException;
import work.tomosse.logic.ProductLogic;
import work.tomosse.model.db.Product;
import work.tomosse.model.request.ProductRequest;
import work.tomosse.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductLogic productLogic;

    /**
     * productのListを返却する
     *
     * @return
     */
    public List<Product> getProductList() {
        return productRepository.selectAll();
    }

    /**
     * productを作成する
     *
     * @param productRequest
     * @return
     */
    public Product createProduct(final ProductRequest productRequest) {
        final var name = productRequest.getName();
        final var product = productRepository.selectByName(name);
        if (product != null) {
            throw new GarageHouseBadRequestException(ErrorCode.ConflictProduct, name);
        }
        productLogic.createProduct(name);
        return productRepository.selectByName(name);
    }

}
