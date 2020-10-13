package com.example.liquibase.repository;

import com.example.liquibase.domain.Car;
import org.springframework.data.repository.CrudRepository;


public interface CarRepository extends CrudRepository<Car, Integer> {
}