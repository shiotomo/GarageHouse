package work.tomosse.api.v1;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import work.tomosse.model.data.AccountRequest;
import work.tomosse.model.data.AccountResponse;
import work.tomosse.model.db.Account;
import work.tomosse.service.AccountService;

@RestController
@RequestMapping("/api/v1/account")
public class AccountApiController {

    @Autowired
    AccountService accountService;

    /**
     * 全accountを返却する
     *
     * @return
     */
    @GetMapping
    public List<AccountResponse> accountAllList() {
        return accountService.getAccountAllList();
    }

    /**
     * accountを作成する
     *
     * @param accountRequest
     * @return
     */
    @PostMapping
    public Account createAccount(@RequestBody @Valid final AccountRequest accountRequest) {
        return accountService.createAccount(accountRequest);
    }
}
