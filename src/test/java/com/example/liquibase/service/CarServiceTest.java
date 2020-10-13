package com.example.liquibase.service;

import com.example.liquibase.domain.Car;
import com.example.liquibase.repository.CarRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CarServiceTest {

    CarRepository carRepository;
    CarService carService;

    @Autowired
    public CarServiceTest(CarRepository carRepository, CarService carService) {
        this.carRepository = carRepository;
        this.carService = carService;
    }

    @Test
    void name1() {
        Iterable<Car> all = carService.getAll();

        for(Car c: all) {
            System.out.println("id: "+c.getId() +", malli: "+c.getModel() +", hinta: " +c.getPrice());
            assertEquals("volvo", c.getModel());
            assertEquals("alu",c.getTires().get(0).getModel());
        }

    }
}