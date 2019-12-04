package work.tomosse.garage_house.mapper.extension;

import org.apache.ibatis.annotations.Mapper;

import work.tomosse.garage_house.model.db.Account;

@Mapper
public interface AccountExtensionMapper {

    /**
     * 指定したnameを持つaccountを取得する
     * nameはユニークなので1つのAccountが返却される
     *
     * @param name
     * @return
     */
    public Account selectByName(String name);

}
