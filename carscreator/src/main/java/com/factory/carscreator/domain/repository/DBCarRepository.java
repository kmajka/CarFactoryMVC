package com.factory.carscreator.domain.repository;

import com.factory.carscreator.domain.Car;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class DBCarRepository implements CarRepository {
    @Override
    public Collection<Car> getAllCars() {
        return null;
    }

    @Override
    public void addCar(Car car) {

    }

    @Override
    public boolean deleteCar(Car car) {
        return false;
    }

    @Override
    public Car getCar(String id) {
        return null;
    }

    @Override
    public void build() {

    }
}
