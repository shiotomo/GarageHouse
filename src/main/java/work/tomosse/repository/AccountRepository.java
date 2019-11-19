package work.tomosse.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import work.tomosse.mapper.AccountMapper;

@Repository
public class AccountRepository {

    @Autowired
    AccountMapper accountMapper;

}
