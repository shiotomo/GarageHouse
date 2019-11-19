package work.tomosse.mapper.extension;

import org.apache.ibatis.annotations.Mapper;

import work.tomosse.model.db.Account;

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
