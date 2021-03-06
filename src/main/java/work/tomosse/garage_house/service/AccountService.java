package work.tomosse.garage_house.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import work.tomosse.garage_house.enums.Role;
import work.tomosse.garage_house.logic.AccountLogic;
import work.tomosse.garage_house.model.db.Account;
import work.tomosse.garage_house.model.request.AccountRequest;
import work.tomosse.garage_house.model.response.AccountResponse;
import work.tomosse.garage_house.repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    AccountLogic accountLogic;

    /**
     * account一覧を返却する
     *
     * @return
     */
    public List<AccountResponse> getAccountList() {
        final var accountList = accountRepository.selectAll();
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
            final var accountRequest = new AccountRequest();
            accountRequest.setName("admin");
            accountRequest.setPassword("admin");
            accountRequest.setRole(Role.ADMIN);
            createAccount(accountRequest);
        }
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
        final var role = accountRequest.getRole().getRole();
        final var account = accountRepository.selectByName(name);
        accountLogic.ensureNotExistAccount(account);
        accountLogic.createAccount(name, password, role);
        return accountRepository.selectByName(name);
    }

    /**
     * accountを削除する
     *
     * @param id
     * @return
     */
    public void deleteAccount(final Long id) {
        final var account = accountRepository.selectById(id);
        accountLogic.ensureExistAccount(account);
        accountRepository.deleteById(id);
    }
}
