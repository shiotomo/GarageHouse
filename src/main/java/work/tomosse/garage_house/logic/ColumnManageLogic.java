package work.tomosse.garage_house.logic;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import work.tomosse.garage_house.enums.ColumnType;
import work.tomosse.garage_house.model.db.Account;
import work.tomosse.garage_house.model.db.ColumnManage;
import work.tomosse.garage_house.model.db.Product;
import work.tomosse.garage_house.repository.ColumnManageRepository;

@Component
public class ColumnManageLogic {

    @Autowired
    ColumnManageRepository columnManageRepository;

    /**
     * column_manageを作成する
     *
     * @param account
     * @param product
     * @param columnType
     * @param validation
     * @return
     */
    public ColumnManage createColumnManage(final Account account, final Product product, final ColumnType columnType) {
        final var columnManage = new ColumnManage();
        columnManage.setColumnType(columnType.getType());
        columnManage.setProductId(product.getId());
        columnManage.setCreatedBy(account.getId());
        columnManage.setUpdatedBy(account.getId());
        columnManage.setCreatedAt(new Date());
        columnManage.setUpdatedAt(new Date());
        columnManageRepository.insert(columnManage);
        return null;
    }

}
