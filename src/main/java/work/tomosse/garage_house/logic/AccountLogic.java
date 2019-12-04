package work.tomosse.garage_house.logic;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import work.tomosse.garage_house.enums.ErrorCode;
import work.tomosse.garage_house.exception.GarageHouseNotFoundException;
import work.tomosse.garage_house.model.db.Account;
import work.tomosse.garage_house.repository.AccountRepository;

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
        final var encordPassword = passwordEncoder.encode(password);
        final var account = new Account();
        account.setName(name);
        account.setPassword(encordPassword);
        account.setRole(role);
        account.setCreated_at(new Date());
        account.setUpdated_at(new Date());
        return accountRepository.insert(account);
    }

    /**
     * accountの存在確認を行う 存在すれば400エラー
     *
     * @param account
     */
    public void ensureExistAccount(final Account account) {
        if (account != null) {
            throw new GarageHouseNotFoundException(ErrorCode.ResourceNotFound);
        }
    }

    /**
     * accountの存在確認を行う 存在しなければ400エラー
     *
     * @param account
     */
    public void ensureNotExistAccount(final Account account) {
        if (account != null) {
            throw new GarageHouseNotFoundException(ErrorCode.ResourceNotFound);
        }
    }
}
