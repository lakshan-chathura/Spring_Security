package com.springsecurity.amigoscode.springsecurity_amigoscode.auth;

import java.util.Optional;

public interface ApplicationUserDAO {
    Optional<ApplicationUser> generateUserDetailsByUserName(String username);
}
