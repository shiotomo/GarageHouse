package work.tomosse.garage_house.service;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work.tomosse.garage_house.enums.Permission;
import work.tomosse.garage_house.logic.AccountProductLogic;
import work.tomosse.garage_house.logic.ProductLogic;
import work.tomosse.garage_house.model.db.Product;
import work.tomosse.garage_house.model.request.ProductRequest;
import work.tomosse.garage_house.repository.AccountProductRepository;
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

    @Autowired
    AccountProductRepository accountProductRepository;


    /**
     * productのListを返却する
     *
     * @return
     */
    public List<Product> getProductList() {
        return productRepository.selectAll();
    }

    /**
     * accountに紐付いているproductを取得する
     *
     * @param principal
     * @return
     */
    public List<Product> getProductListByAccount(final Principal principal) {
        final var account = accountRepository.selectByName(principal.getName());
        return productRepository.selectByAccount(account.getId());
    }

    /**
     * 指定したIDのproductを取得する
     *
     * @param productId
     * @return
     */
    public Product getProductById(final Long productId) {
        return productRepository.selectById(productId);
    }

    /**
     * productを作成する
     *
     * @param product
     * @return
     */
    public Product createProduct(final Principal principal, final Product product) {
        final var name = product.getName();
        final var accountName = principal.getName();
        final var account = accountRepository.selectByName(accountName);
        final var createProduct = productLogic.createProduct(name, account.getId());
        accountProductLogic.createAccountProduct(account, createProduct, Permission.WRITE_AND_READ);
        return createProduct;
    }

    /**
     * productを作成する
     *
     * @param productRequest
     * @return
     */
    public Product createProduct(final ProductRequest productRequest) {
        // TODO JWTを実装する
        // final var name = productRequest.getName();
        // final var createProduct = productLogic.createProduct(name);
        // TODO accountと紐付ける処理を実装する
        // return createProduct;
        return null;
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
        productLogic.ensureNotExistProduct(product);
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
        productLogic.ensureNotExistProduct(product);
        productRepository.deleteById(id);
    }
}
