package work.tomosse.logic;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import work.tomosse.model.db.Account;
import work.tomosse.repository.AccountRepository;

@Component
public class AccountLogic {

    @Autowired
    AccountRepository accountRepository;

    private final static BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    /**
     * accountを作成する
     *
     * @param name
     * @param password
     * @param role
     * @return
     */
    public int createAccount(final String name, final String password, final String role) {
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
