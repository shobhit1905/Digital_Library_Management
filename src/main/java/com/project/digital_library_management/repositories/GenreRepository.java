package com.project.digital_library_management.repositories;

import com.project.digital_library_management.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
