package com.example.liquibase.service;

import com.example.liquibase.domain.Car;
import com.example.liquibase.domain.Tire;
import com.example.liquibase.repository.CarRepository;
import com.example.liquibase.repository.TireRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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
    TireRepository tireRepository;

    @Autowired
    public CarServiceTest(CarRepository carRepository, TireRepository tireRepository ) {
        this.carRepository = carRepository;
        this.tireRepository = tireRepository;

    }

    @Test
    void name() {

        Iterable<Car> all = carRepository.findAll();
        all.forEach(i -> {
          System.out.println("car id: "+i.getId());
          carRepository.delete(i);
          carRepository.flush();
        });

        Car car = new Car();
        car.setModel("volvo");
        car.setPrice(100);

        Tire tire = new Tire();
        tire.setCar(car);
        tire.setModel("nokia");
        tire.setPrice(30);
        List<Tire> tires = new ArrayList<>();
        tires.add(tire);
        tireRepository.saveAndFlush(tire);

        car.setTires(tires);
        Car save = carRepository.saveAndFlush(car);

        assertEquals(1,1);
    }

}