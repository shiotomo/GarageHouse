package work.tomosse.garage_house.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import work.tomosse.garage_house.mapper.AccountMapper;
import work.tomosse.garage_house.mapper.extension.AccountExtensionMapper;
import work.tomosse.garage_house.model.db.Account;
import work.tomosse.garage_house.model.db.AccountExample;

@Repository
public class AccountRepository {

    @Autowired
    AccountMapper accountMapper;

    @Autowired
    AccountExtensionMapper accountExtensionMapper;

    /**
     * accountを全件返却する
     *
     * @return
     */
    public List<Account> selectAll() {
        final var example = new AccountExample();
        return accountMapper.selectByExample(example);
    }

    /**
     * accountの数を返却する
     *
     * @return
     */
    public long count() {
        final var example = new AccountExample();
        return accountMapper.countByExample(example);
    }

    /**
     * 指定したIDを持つaccountを取得する
     *
     * @param id
     * @return
     */
    public Account selectById(final Long id) {
        return accountMapper.selectByPrimaryKey(id);
    }

    /**
     * 指定したnameを持つaccountを取得する
     *
     * @param name
     * @return
     */
    public Account selectByName(final String name) {
        return accountExtensionMapper.selectByName(name);
    }

    /**
     * accountを作成する
     *
     * @param account
     * @return
     */
    public int insert(final Account account) {
        return accountMapper.insert(account);
    }

    /**
     * accountを削除する
     *
     * @param account
     * @return
     * @return
     */
    public int deleteById(final Long id) {
        return accountMapper.deleteByPrimaryKey(id);
    }
}
