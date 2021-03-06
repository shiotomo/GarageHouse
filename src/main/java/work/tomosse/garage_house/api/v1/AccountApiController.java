package work.tomosse.garage_house.api.v1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import work.tomosse.garage_house.enums.SuccessCode;
import work.tomosse.garage_house.model.db.Account;
import work.tomosse.garage_house.model.request.AccountRequest;
import work.tomosse.garage_house.model.response.AccountResponse;
import work.tomosse.garage_house.model.response.SuccessResponse;
import work.tomosse.garage_house.service.AccountService;

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
    public List<AccountResponse> getAccountList() {
        return accountService.getAccountList();
    }

    /**
     * accountを作成する
     *
     * @param accountRequest
     * @return
     */
    @ApiOperation(value = "アカウント作成", notes = "アカウントを作成します。")
    @PostMapping
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
    public SuccessResponse deleteAccount(@PathVariable final Long id) {
        accountService.deleteAccount(id);
        return new SuccessResponse(SuccessCode.SuccessDelete);
    }
}
