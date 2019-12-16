package work.tomosse.garage_house.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import work.tomosse.garage_house.mapper.ColumnManageMapper;
import work.tomosse.garage_house.mapper.extension.ColumnManageExtensionMapper;
import work.tomosse.garage_house.model.db.ColumnManage;
import work.tomosse.garage_house.model.parameter.ColumnManageParameter;

@Repository
public class ColumnManageRepository {

    @Autowired
    ColumnManageMapper columnManageMapper;

    @Autowired
    ColumnManageExtensionMapper columnManageExtensionMapper;

    /**
     * 指定したproduct_idに紐づくcolumn_manageを取得する
     *
     * @param productId
     * @return
     */
    public List<ColumnManage> selectByProductId(final Long productId) {
        return columnManageExtensionMapper.selectByProductId(productId);
    }

    /**
     * 指定したnameとproductIdに紐づくcolumn_manageを取得する
     *
     * @param name
     * @param productId
     * @return
     */
    public ColumnManage selectByNameAndProductId(final String name, final Long productId) {
        final var columnManageParameter = new ColumnManageParameter(name, productId);
        return columnManageExtensionMapper.selectByNameAndProductId(columnManageParameter);
    }

    /**
     * column_manageを作成する
     *
     * @param columnManage
     * @return
     */
    public int insert(final ColumnManage columnManage) {
        return columnManageMapper.insert(columnManage);
    }
}
