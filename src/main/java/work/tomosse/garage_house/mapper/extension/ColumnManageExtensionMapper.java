package work.tomosse.garage_house.mapper.extension;

import org.apache.ibatis.annotations.Mapper;

import work.tomosse.garage_house.model.db.ColumnManage;
import work.tomosse.garage_house.model.parameter.ColumnManageParameter;

@Mapper
public interface ColumnManageExtensionMapper {

    /**
     * 指定したcolumnManageParameterに紐づくcolumn_manageを取得する
     *
     * @param columnManageParameter
     * @return
     */
    public ColumnManage selectByNameAndProductId(ColumnManageParameter columnManageParameter);
}
