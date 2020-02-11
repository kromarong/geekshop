package ru.kromarong.geekshop.persistence.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kromarong.geekshop.persistence.model.Picture;


public interface PictureRepository extends JpaRepository<Picture, Long> {
}
