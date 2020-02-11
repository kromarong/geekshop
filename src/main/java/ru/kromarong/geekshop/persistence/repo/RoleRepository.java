package ru.kromarong.geekshop.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kromarong.geekshop.persistence.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
