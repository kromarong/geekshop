package ru.kromarong.geekshop.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kromarong.geekshop.persistence.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
