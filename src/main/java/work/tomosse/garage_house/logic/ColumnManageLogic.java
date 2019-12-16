package work.tomosse.garage_house.logic;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import work.tomosse.garage_house.enums.ErrorCode;
import work.tomosse.garage_house.exception.GarageHouseNotFoundException;
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
     */
    public void createColumnManage(final Account account, final Product product, final String columnName, final String columnType) {
        final var columnManage = new ColumnManage();
        columnManage.setName(columnName);
        columnManage.setColumnType(columnType);
        columnManage.setProductId(product.getId());
        columnManage.setCreatedBy(account.getId());
        columnManage.setUpdatedBy(account.getId());
        columnManage.setCreatedAt(new Date());
        columnManage.setUpdatedAt(new Date());
        columnManageRepository.insert(columnManage);
    }

    /**
     * Productに紐付いたColumnManageの存在確認を行う 存在すれば400エラー
     *
     * @param account
     */
    public void ensureExistColumnManage(final ColumnManage columnManage) {
        if (columnManage != null) {
            throw new GarageHouseNotFoundException(ErrorCode.ConflictColumnManage, columnManage.getName());
        }
    }
}
