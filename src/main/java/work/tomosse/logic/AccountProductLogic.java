package work.tomosse.logic;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import work.tomosse.enums.Permission;
import work.tomosse.model.db.Account;
import work.tomosse.model.db.AccountProduct;
import work.tomosse.model.db.Product;
import work.tomosse.repository.AccountProductRepository;

@Component
public class AccountProductLogic {

    @Autowired
    AccountProductRepository accountProductRepository;

    public int createAccountProduct(final Account account, final Product product) {
        final var accountId = account.getId();
        final var productId = product.getId();
        final var accountProduct = new AccountProduct();
        accountProduct.setAccount_id(accountId);
        accountProduct.setProduct_id(productId);
        accountProduct.setPermission(Permission.WRITE_AND_READ.getId());
        accountProduct.setCreated_at(new Date());
        accountProduct.setUpdated_at(new Date());
        accountProduct.setCreated_by(accountId);
        accountProduct.setUpdated_by(accountId);
        return accountProductRepository.insert(accountProduct);
    }
}
