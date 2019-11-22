package work.tomosse.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import work.tomosse.enums.Role;
import work.tomosse.model.data.AccountRequest;
import work.tomosse.model.data.AccountResponse;
import work.tomosse.model.db.Account;
import work.tomosse.repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    private final static BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    /**
     * accountを全件返却する
     *
     * @return
     */
    public List<Account> selectAll() {
        return accountRepository.selectAll();
    }

    /**
     * accountを全返却する(API用)
     *
     * @return
     */
    public List<AccountResponse> getAccountAllList() {
        final var accountList =  selectAll();
        final var accountResponseList = new ArrayList<AccountResponse>();
        accountList.forEach(account -> {
            accountResponseList.add(new AccountResponse(account.getId(), account.getName(), account.getRole()));
        });
        return accountResponseList;
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
        return createAccount(name, password, Role.ADMIN.getRole());
    }

    /**
     * USERのaccountを作成する
     *
     * @param name
     * @param password
     * @param role
     */
    public int createUserAccount(final String name, final String password) {
        return createAccount(name, password, Role.USER.getRole());
    }

    /**
     * accountを作成する
     *
     * @param accountRequest
     * @return
     */
    public Account createAccount(final AccountRequest accountRequest) {
        final var name = accountRequest.getName();
        final var password = accountRequest.getPassword();
        final var role = accountRequest.getRole();
        final var id = createAccount(name, password, role);
        return accountRepository.selectById((long) id);
    }

    /**
     * accountを作成する
     *
     * @param name
     * @param password
     * @param role
     * @return
     */
    private int createAccount(final String name, final String password, final String role) {
        final String encordPassword = passwordEncoder.encode(password);
        final var account = new Account();
        account.setName(name);
        account.setPassword(encordPassword);
        account.setRole(role);
        account.setCreated_at(new Date());
        account.setUpdated_at(new Date());
        return accountRepository.insert(account);
    }
}
