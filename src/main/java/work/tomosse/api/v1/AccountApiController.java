package work.tomosse.api.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import work.tomosse.model.data.AccountRequest;
import work.tomosse.model.data.AccountResponse;
import work.tomosse.model.db.Account;
import work.tomosse.service.AccountService;

@Api(tags = "Account")
@ApiModel(value = "Account", description = "Account REST API")
@RestController
@RequestMapping("/api/v1/accounts")
public class AccountApiController {

    @Autowired
    AccountService accountService;

    /**
     * 全accountを返却する
     *
     * @return
     */
    @GetMapping
    public List<AccountResponse> getAccountList() {
        return accountService.getAccountAllList();
    }

    /**
     * accountを作成する
     *
     * @param accountRequest
     * @return
     */
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Account createAccount(@RequestBody final AccountRequest accountRequest) {
        return accountService.createAccount(accountRequest);
    }
}
