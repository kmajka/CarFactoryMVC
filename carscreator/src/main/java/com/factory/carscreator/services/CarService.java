package com.factory.carscreator.services;

import com.factory.carscreator.domain.Car;
import com.factory.carscreator.domain.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class CarService {

    @Autowired
    @Qualifier("inMemoryCarRepository")
    CarRepository inMemory;

    public Collection<Car> getCars() {
        return inMemory.getAllCars();
    }
}
