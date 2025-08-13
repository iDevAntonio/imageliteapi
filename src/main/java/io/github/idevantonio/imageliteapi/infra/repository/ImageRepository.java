package io.github.idevantonio.imageliteapi.infra.repository;

import io.github.idevantonio.imageliteapi.domain.entity.Image;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepository extends JpaRepository<Image, String> {
}
