package com.berktas.flyway.repositories;


import com.berktas.flyway.model.Schools;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SchoolRepository extends JpaRepository<Schools, Long> {
}
