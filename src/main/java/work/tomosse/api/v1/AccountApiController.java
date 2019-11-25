package work.tomosse.api.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
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
     * account一覧を返却する
     *
     * @return
     */
    @ApiOperation(value = "アカウント一覧取得", notes = "アカウントの一覧を返却します。")
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<AccountResponse> getAccountList() {
        return accountService.getAccountAllList();
    }

    /**
     * accountを作成する
     *
     * @param accountRequest
     * @return
     */
    @ApiOperation(value = "アカウント作成", notes = "アカウントを作成します。")
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Account createAccount(@RequestBody final AccountRequest accountRequest) {
        return accountService.createAccount(accountRequest);
    }

    /**
     * accountを削除する
     *
     * @param accountRequest
     * @return
     * @return
     */
    @ApiOperation(value = "アカウント削除", notes = "アカウントを削除します。")
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteAccount(@PathVariable final Long id) {
        accountService.deleteAccount(id);
    }
}
