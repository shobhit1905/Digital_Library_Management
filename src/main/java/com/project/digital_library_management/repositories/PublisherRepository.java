package com.project.digital_library_management.repositories;

import com.project.digital_library_management.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher , Long> {
}
