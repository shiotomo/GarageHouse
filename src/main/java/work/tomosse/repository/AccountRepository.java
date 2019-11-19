package work.tomosse.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import work.tomosse.mapper.AccountMapper;
import work.tomosse.model.db.Account;
import work.tomosse.model.db.AccountExample;

@Repository
public class AccountRepository {

    @Autowired
    AccountMapper accountMapper;

    public List<Account> selectAll() {
        final var example = new AccountExample();
        return accountMapper.selectByExample(example);
    }
}
