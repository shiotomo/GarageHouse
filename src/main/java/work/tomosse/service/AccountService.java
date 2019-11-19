package work.tomosse.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work.tomosse.model.db.Account;
import work.tomosse.repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    /**
     * accountを全件返却する
     *
     * @return
     */
    public List<Account> selectAll() {
        return accountRepository.selectAll();
    }

    /**
     * 指定したnameを持つaccountを取得する
     *
     * @param name
     * @return
     */
    public Account selectByName(final String name) {
        return accountRepository.selectByName(name);
    }

}
