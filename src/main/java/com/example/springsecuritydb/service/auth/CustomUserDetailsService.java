package com.example.springsecuritydb.service.auth;

import com.example.springsecuritydb.dao.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("ActionLog.loadUserByUsername.start");
        var userEntity = userRepository.findByName(username);
        if (userEntity == null) throw new RuntimeException("USER_NOT_FOUND");
        log.info("ActionLog.loadUserByUsername.end");
        return new CustomUserDetails(userEntity);
    }
}
