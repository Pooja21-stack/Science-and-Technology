package com.sci.technology.auth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.google.common.annotations.Beta;

@Component
public class ApplicationUserService implements UserDetailsService {
	 private ApplicationUserDao applicationUserDao;
	 	
	    public ApplicationUserService() {
	    	super();
	    	this.applicationUserDao = null;
		
	}

		@Autowired
	    public ApplicationUserService(@Qualifier("fake") ApplicationUserDao applicationUserDao) {
	        this.applicationUserDao = null;
			this.applicationUserDao = applicationUserDao;
	    }

	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        return applicationUserDao
	                .selectApplicationUserByUsername(username)
	                .orElseThrow(() ->
	                        new UsernameNotFoundException(String.format("Username %s not found", username))
	                );
	    }
}
