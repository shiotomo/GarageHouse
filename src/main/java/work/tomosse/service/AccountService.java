package work.tomosse.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import work.tomosse.enums.ErrorCode;
import work.tomosse.enums.Role;
import work.tomosse.exception.GarageHouseBadRequestException;
import work.tomosse.exception.GarageHouseNotFoundException;
import work.tomosse.logic.AccountLogic;
import work.tomosse.model.db.Account;
import work.tomosse.model.request.AccountRequest;
import work.tomosse.model.response.AccountResponse;
import work.tomosse.repository.AccountRepository;

@Service
public class AccountService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    AccountLogic accountLogic;

    @Autowired
    MessageSource messageSource;

    /**
     * account一覧を返却する
     *
     * @return
     */
    public List<AccountResponse> getAccountAllList() {
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
        final var message = messageSource.getMessage("api.message.error.conflictAccount", null, Locale.JAPANESE);
        if (account != null) {
            throw new GarageHouseBadRequestException(ErrorCode.ConflictAccount);
        }
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
        if (account == null) {
            throw new GarageHouseNotFoundException(ErrorCode.NotFoundResource);
        }
        accountRepository.deleteById(id);
    }
}
