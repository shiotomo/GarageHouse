package work.tomosse.garage_house.service;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work.tomosse.garage_house.logic.ColumnManageLogic;
import work.tomosse.garage_house.model.db.ColumnManage;
import work.tomosse.garage_house.repository.AccountRepository;
import work.tomosse.garage_house.repository.ColumnManageRepository;
import work.tomosse.garage_house.repository.ProductRepository;

@Service
public class ColumnManageService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    ColumnManageLogic columnManageLogic;

    @Autowired
    ColumnManageRepository columnManageRepository;

    /**
     * productに紐付いたcolumn_manageを取得する
     *
     * @param productId
     * @return
     */
    public Object selectByProductId(final Long productId) {
        return columnManageRepository.selectByProductId(productId);
    }

    /**
     * column_manageを作成する
     *
     * @param principal
     * @param productId
     * @param columnManage
     * @return
     */
    public void create(final Principal principal, final Long productId,final ColumnManage columnManage) {
        final var account = accountRepository.selectByName(principal.getName());
        final var product = productRepository.selectById(productId);
        final var existColumnManage = columnManageRepository.selectByNameAndProductId(columnManage.getName(), columnManage.getProductId());
        columnManageLogic.ensureExistColumnManage(existColumnManage);
        columnManageLogic.createColumnManage(account, product, columnManage.getName(), columnManage.getColumnType());
    }
}
