package ru.kromarong.geekshop.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import ru.kromarong.geekshop.controllers.repr.UserRepr;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {

    void save(UserRepr userRepr);

    List<UserRepr> findAll();

    Optional<UserRepr> findById(Long id);

    void delete(Long id);

    UserDetails loadUserByUsername(String s) throws UsernameNotFoundException;
}
