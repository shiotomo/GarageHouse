package work.tomosse.garage_house.logic;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import work.tomosse.garage_house.enums.Permission;
import work.tomosse.garage_house.model.db.Account;
import work.tomosse.garage_house.model.db.AccountProduct;
import work.tomosse.garage_house.model.db.Product;
import work.tomosse.garage_house.repository.AccountProductRepository;

@Component
public class AccountProductLogic {

    @Autowired
    AccountProductRepository accountProductRepository;

    /**
     * account_productを作成する
     *
     * @param account
     * @param product
     * @param permission
     * @return
     */
    public int createAccountProduct(final Account account, final Product product, final Permission permission) {
        final var accountId = account.getId();
        final var productId = product.getId();
        final var accountProduct = getAccountProduct(accountId, productId, permission);
        return accountProductRepository.insert(accountProduct);
    }

    /**
     * 作成するaccount_productを返却する
     *
     * @param accountId
     * @param productId
     * @param permission
     * @return
     */
    private AccountProduct getAccountProduct(final Long accountId, final Long productId, final Permission permission) {
        final var accountProduct = new AccountProduct();
        accountProduct.setAccountId(accountId);
        accountProduct.setProductId(productId);
        accountProduct.setPermission(permission.getId());
        accountProduct.setCreatedAt(new Date());
        accountProduct.setUpdatedAt(new Date());
        accountProduct.setCreatedBy(accountId);
        accountProduct.setUpdatedBy(accountId);
        return accountProduct;
    }
}
