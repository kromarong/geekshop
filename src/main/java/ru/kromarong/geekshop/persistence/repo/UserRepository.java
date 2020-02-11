package ru.kromarong.geekshop.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kromarong.geekshop.persistence.model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findUserByUsername(String userName);

    boolean existsUserByEmail(String email);

    Optional<User> findUserByEmail(String email);
}
