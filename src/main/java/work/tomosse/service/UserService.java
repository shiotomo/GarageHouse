package work.tomosse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import work.tomosse.repository.AccountRepository;

@Service
@Transactional
public class UserService implements UserDetailsService {
    private static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    @Autowired
    AccountRepository accountRepository;

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        final var account = accountRepository.selectByName(username);
        if (account == null) {
            throw new UsernameNotFoundException("userName" + username + "was not found in the database");
        }
        final var userDetails = new User(account.getName(),
                bCryptPasswordEncoder.encode(account.getPassword()), null
                );
        return userDetails;
    }

}
