package com.springsecurity.amigoscode.springsecurity_amigoscode.auth;

import com.google.common.collect.Lists;
import com.springsecurity.amigoscode.springsecurity_amigoscode.security.PasswordConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static com.springsecurity.amigoscode.springsecurity_amigoscode.security.ApplicationRoles.*;

@Repository("repo")
public class ApplicationUserDAOService implements ApplicationUserDAO{
    @Autowired
    private PasswordConfiguration passwordConfiguration;

    @Override
    public Optional<ApplicationUser> generateUserDetailsByUserName(String username) {
        return getApplicationUsers()
                .stream()
                .filter(applicationUser -> username.equals(applicationUser.getUsername()))
                .findFirst();
    }

    private List<ApplicationUser> getApplicationUsers() {
        List<ApplicationUser> applicationUsers =  Lists.newArrayList(
                new ApplicationUser(
                        STUDENT.getGrantedAuthorities(),
                        passwordConfiguration.getPasswordEncoder().encode("lakshan123"),
                        "lakshan",
                        true,
                        true,
                        true,
                        true
                ),
                new ApplicationUser(
                        ADMIN.getGrantedAuthorities(),
                        passwordConfiguration.getPasswordEncoder().encode("janith123"),
                        "janith",
                        true,
                        true,
                        true,
                        true
                ),
                new ApplicationUser(
                        ADMINTRAINEE.getGrantedAuthorities(),
                        passwordConfiguration.getPasswordEncoder().encode("mendis123"),
                        "mendis",
                        true,
                        true,
                        true,
                        true
                )
        );
        return applicationUsers;
    }
}

