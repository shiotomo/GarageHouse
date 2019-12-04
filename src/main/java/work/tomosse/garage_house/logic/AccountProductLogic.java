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
