package com.sci.technology.security;

import static com.sci.technology.security.ApplicationUserAuthority.*;
import java.util.Set;
import java.util.stream.Collectors;
import com.google.common.collect.Sets;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

public enum ApplicationUserRole {
	 USER(Sets.newHashSet(BOOKS_READ,CATEGORIES_READ,BOOKS_CATEGORIES_READ,USER_READ,USER_WRITE)),
	 ADMIN(Sets.newHashSet(BOOKS_READ, BOOKS_WRITE, BOOKS_DELETE, CATEGORIES_READ, CATEGORIES_WRITE,CATEGORIES_DELETE, BOOKS_CATEGORIES_READ,BOOKS_CATEGORIES_WRITE, BOOKS_CATEGORIES_DELETE,USER_READ,USER_WRITE, USER_DELETE ));
	
	 private final Set<ApplicationUserAuthority> permissions;
	 
	 ApplicationUserRole(Set<ApplicationUserAuthority> permissions) {
	        this.permissions = permissions;
	  }

	 public Set<ApplicationUserAuthority> getPermissions() {
	        return permissions;
	    }

	    public Set<GrantedAuthority> getGrantedAuthorities() {
	        Set<GrantedAuthority> permissions = this.permissions.stream()
	                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
	                .collect(Collectors.toSet());
	        permissions.add(new SimpleGrantedAuthority("ROLE_" + this.name()));

	        return permissions;
	    }
}
