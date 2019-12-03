package work.tomosse.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import work.tomosse.mapper.AccountProductMapper;
import work.tomosse.model.db.AccountProduct;

@Repository
public class AccountProductRepository {

    @Autowired
    AccountProductMapper accountProductMapper;

    /**
     * account_productを作成する
     *
     * @param accountProduct
     * @return
     */
    public int insert(final AccountProduct accountProduct) {
        return accountProductMapper.insert(accountProduct);
    }

}
