package com.springsecurity.amigoscode.springsecurity_amigoscode.auth;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class ApplicationUser implements UserDetails {
    private final Set<? extends GrantedAuthority> getGrantedAuthorities;
    private final String getUserName;
    private final String getPassword;
    private final boolean getisAccountNonExpired;
    private final boolean getisAccountNonLocked;
    private final boolean getisCredentialsNonExpired;
    private final boolean getisEnabled;

    public ApplicationUser(Set<? extends GrantedAuthority> getGrantedAuthorities, String getUserName, String getPassword, boolean getisAccountNonExpired, boolean getisAccountNonLocked, boolean getisCredentialsNonExpired, boolean getisEnabled) {
        this.getGrantedAuthorities = getGrantedAuthorities;
        this.getUserName = getUserName;
        this.getPassword = getPassword;
        this.getisAccountNonExpired = getisAccountNonExpired;
        this.getisAccountNonLocked = getisAccountNonLocked;
        this.getisCredentialsNonExpired = getisCredentialsNonExpired;
        this.getisEnabled = getisEnabled;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return getGrantedAuthorities;
    }

    @Override
    public String getPassword() {
        return getPassword;
    }

    @Override
    public String getUsername() {
        return getUserName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return getisAccountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return getisAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return getisCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return getisEnabled;
    }
}
