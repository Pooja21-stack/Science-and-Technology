package com.sci.technology.service;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.sci.technology.dto.SciUserDTO;
import com.sci.technology.entity.SciPrivileges;
import com.sci.technology.entity.SciUser;
import com.sci.technology.repository.UserRepository;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public SciUser findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public SciUser save(SciUserDTO registration) {
    	SciUser user = new SciUser();
        user.setFirstName(registration.getFirstName());
        user.setLastName(registration.getFirstName());
        user.setEmail(registration.getEmail());
        user.setPassword(passwordEncoder.encode(registration.getPassword()));
       // user.setRoles(Arrays.asList(new Role("ROLE_USER")));
        return userRepository.save(user);
    }

    /*
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        SciUser user = userRepository.findByEmail(email);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password.");
        }
        return new org.springframework.security.core.userdetails.User(user.getEmail(),
            user.getPassword(),
            mapRolesToAuthorities(user.getRoles()));
            //mapRolesToAuthorities(user.getUserType()));
    }

    private Collection < ? extends GrantedAuthority > mapRolesToAuthorities(Collection < SciPrivileges > privileges) {
        return privileges.stream()
            .map(role - > new SimpleGrantedAuthority(role.getName()))
            .collect(Collectors.toList());
    }
    */
 
}
