package com.example.springsecuritydb.service.auth;

import com.example.springsecuritydb.dao.entity.UserEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class CustomUserDetails implements UserDetails {

    private String name;
    private String password;

    private List<GrantedAuthority> roles;

    public CustomUserDetails(UserEntity userEntity) {
        this.name =userEntity.getName();
        this.password=userEntity.getPassword();
        this.roles=userEntity.getRoleList().stream()
                .map((role->new SimpleGrantedAuthority(role.getName())))
                .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
