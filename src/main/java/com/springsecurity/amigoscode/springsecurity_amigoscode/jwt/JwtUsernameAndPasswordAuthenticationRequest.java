package com.springsecurity.amigoscode.springsecurity_amigoscode.jwt;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class JwtUsernameAndPasswordAuthenticationRequest {
    private String username;
    private String password;

}
