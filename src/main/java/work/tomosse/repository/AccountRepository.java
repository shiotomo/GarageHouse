package work.tomosse.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import work.tomosse.mapper.AccountMapper;
import work.tomosse.mapper.extension.AccountExtensionMapper;
import work.tomosse.model.db.Account;
import work.tomosse.model.db.AccountExample;

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
     * 指定したnameを持つaccountを取得する
     *
     * @param name
     * @return
     */
    public Account selectByName(final String name) {
        return accountExtensionMapper.selectByName(name);
    }

    public int insert(final Account account) {
        return accountMapper.insert(account);
    }
}
