package com.example.liquibase.service;

import com.example.liquibase.domain.Car;
import com.example.liquibase.repository.CarRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Iterable<Car> getAll(){
        return carRepository.findAll();
    }
}
