package work.tomosse.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import work.tomosse.mapper.AccountMapper;
import work.tomosse.model.db.Account;

public class AccountRepository {

    @Autowired
    AccountMapper accountMapper;

    /**
     * 全アカウントを取得する
     *
     * @return
     */
    public Optional<List<Account>> select() {
        return accountMapper.findAll();
    }

    /**
     * 指定したIDを持つアカウントを取得する
     *
     * @param id
     * @return
     */
    public Optional<Account> selectById(final int id) {
        return accountMapper.findById(id);
    }

    /**
     * 指定したnameを持つアカウントを取得する
     *
     * @param id
     * @return
     */
    public Optional<Account> selectByName(final String name) {
        return accountMapper.findByName(name);
    }

}
