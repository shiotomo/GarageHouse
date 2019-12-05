package work.tomosse.garage_house.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import work.tomosse.garage_house.mapper.ColumnManageMapper;
import work.tomosse.garage_house.model.db.ColumnManage;

@Repository
public class ColumnManageRepository {

    @Autowired
    ColumnManageMapper columnManageMapper;

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
