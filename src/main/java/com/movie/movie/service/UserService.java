package com.movie.movie.service;

import com.movie.movie.entity.User;
import com.movie.movie.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService implements UserDetailsService {

    private Logger logger= LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User currentUser = userRepository.findByUsername(username);

        if(currentUser==null){
            logger.error("Error en el login, no existe username: "+username);
            throw new UsernameNotFoundException("Error en el login, no existe username: "+username);
        }

        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        grantedAuthorities = currentUser.getRoles().stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .peek(simpleGrantedAuthority -> logger.info("role: "+simpleGrantedAuthority.getAuthority()))
                .collect(Collectors.toList());

        org.springframework.security.core.userdetails.User user;
        user = new org.springframework.security.core.userdetails.User(currentUser.getUsername(),
                currentUser.getPassword(), currentUser.getEnabled(), true, true,
                true, grantedAuthorities);
        return user;
    }
}
