package work.tomosse.mapper;

import java.util.List;
import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;

import work.tomosse.model.db.Account;

@Mapper
public interface AccountMapper {

    Optional<Account> findById(final int id);

    Optional<List<Account>> findAll();

    Optional<Account> findByName(final String name);

}
