package work.tomosse.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import work.tomosse.enums.Role;
import work.tomosse.model.db.Account;
import work.tomosse.repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

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

    /**
     * accountが存在しない時ADMINを作成する
     */
    public void createAdmin() {
        final var accountList = accountRepository.selectAll();
        if (accountList.isEmpty()) {
            createAdminAccount("admin", "admin");
        }
    }

    /**
     * ADMINのaccountを作成する
     *
     * @param name
     * @param password
     * @param role
     */
    public int createAdminAccount(final String name, final String password) {
        final String encordPassword = passwordEncoder.encode(password);
        final var account = new Account();
        account.setName(name);
        account.setPassword(encordPassword);
        account.setRole(Role.ADMIN.getRole());
        account.setCreated_at(new Date());
        account.setUpdated_at(new Date());
        return accountRepository.insert(account);
    }

    /**
     * USERのaccountを作成する
     *
     * @param name
     * @param password
     * @param role
     */
    public int createUserAccount(final String name, final String password) {
        final String encordPassword = passwordEncoder.encode(password);
        final var account = new Account();
        account.setName(name);
        account.setPassword(encordPassword);
        account.setRole(Role.USER.getRole());
        account.setCreated_at(new Date());
        account.setUpdated_at(new Date());
        return accountRepository.insert(account);
    }
}
