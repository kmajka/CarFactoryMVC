package com.factory.carscreator.domain.repository;

import com.factory.carscreator.domain.Car;

import java.util.Collection;

public interface CarRepository {
    Collection<Car> getAllCars();
    void addCar(Car car);
    boolean deleteCar(Car car);
    Car getCar(String id);
    void build();

}
