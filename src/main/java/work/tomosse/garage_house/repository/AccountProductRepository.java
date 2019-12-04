package work.tomosse.garage_house.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import work.tomosse.garage_house.mapper.AccountProductMapper;
import work.tomosse.garage_house.model.db.AccountProduct;

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
