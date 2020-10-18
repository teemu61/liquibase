package com.example.liquibase.repository;

import com.example.liquibase.domain.Tire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TireRepository extends JpaRepository<Tire, Long> {
}
