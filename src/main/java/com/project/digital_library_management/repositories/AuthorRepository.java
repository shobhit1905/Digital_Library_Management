package com.project.digital_library_management.repositories;

import com.project.digital_library_management.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
