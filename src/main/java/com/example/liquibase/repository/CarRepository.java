package com.example.liquibase.repository;

import com.example.liquibase.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface CarRepository extends JpaRepository<Car, Long> {
}