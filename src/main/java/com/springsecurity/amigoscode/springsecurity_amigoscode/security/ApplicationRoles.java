package com.springsecurity.amigoscode.springsecurity_amigoscode.security;

import com.google.common.collect.Sets;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static com.springsecurity.amigoscode.springsecurity_amigoscode.security.UserPermissions.*;

public enum ApplicationRoles {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(COURSE_READ,COURSE_WRITE,STUDENT_READ,STUDENT_WRITE)),
    ADMINTRAINEE(Sets.newHashSet(COURSE_READ,STUDENT_READ));


    private final Set<UserPermissions> applicationUserPermissionSet;

    ApplicationRoles(Set<UserPermissions> applicationUserPermissionSet) {
        this.applicationUserPermissionSet = applicationUserPermissionSet;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities(){
        Set<SimpleGrantedAuthority> permissions=applicationUserPermissionSet.stream()
                .map(permit-> new SimpleGrantedAuthority(permit.getPermissions())).collect(Collectors.toSet());
        permissions.add(new SimpleGrantedAuthority("ROLE_"+this.name()));
        return permissions;
    }
}
