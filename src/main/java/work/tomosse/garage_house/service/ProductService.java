package work.tomosse.garage_house.service;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work.tomosse.garage_house.enums.ErrorCode;
import work.tomosse.garage_house.exception.GarageHouseBadRequestException;
import work.tomosse.garage_house.logic.AccountProductLogic;
import work.tomosse.garage_house.logic.ProductLogic;
import work.tomosse.garage_house.model.db.Product;
import work.tomosse.garage_house.model.request.ProductRequest;
import work.tomosse.garage_house.repository.AccountRepository;
import work.tomosse.garage_house.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    ProductLogic productLogic;

    @Autowired
    AccountProductLogic accountProductLogic;

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
     * @param product
     * @return
     */
    public Product createProduct(final Principal principal, final Product product) {
        final var name = product.getName();
        final var createProduct = productLogic.createProduct(name);
        final var accountName = principal.getName();
        final var account = accountRepository.selectByName(accountName);
        accountProductLogic.createAccountProduct(account, createProduct);
        return createProduct;
    }
    /**
     * productを作成する
     *
     * @param productRequest
     * @return
     */
    public Product createProduct(final ProductRequest productRequest) {
        final var name = productRequest.getName();
        final var createProduct = productLogic.createProduct(name);
        // TODO accountと紐付ける処理を実装する
        return createProduct;
    }

    /**
     * productを更新する
     *
     * @param id
     * @param productRequest
     * @return
     */
    public Product updateProduct(final Long id, final ProductRequest productRequest) {
        final var product = productRepository.selectById(id);
        if (product == null) {
            throw new GarageHouseBadRequestException(ErrorCode.ResourceNotFound);
        }
        productLogic.updateProduct(product, productRequest);
        return productRepository.selectById(id);
    }

    /**
     * productを削除する
     *
     * @param id
     */
    public void deleteProduct(final Long id) {
        final var product = productRepository.selectById(id);
        if (product == null) {
            throw new GarageHouseBadRequestException(ErrorCode.ResourceNotFound);
        }
        productRepository.deleteById(id);
    }
}
