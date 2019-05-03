package com.factory.carscreator.domain.repository;

import com.factory.carscreator.domain.Car;
import com.factory.carscreator.modelcar.CarType;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Component
public class InMemoryCarRepository implements CarRepository {

    List<Car> cars = new ArrayList<Car>();

    @Override
    public Collection<Car> getAllCars() {
        return cars.stream().collect(Collectors.toList());
    }

    @Override
    public void addCar(Car car) {
        if (!cars.contains((car))) {
            cars.add(car);
        }
    }

    @Override
    public boolean deleteCar(Car car) {
        return cars.remove(car);
    }

    @Override
    public Car getCar(String id) {

        Optional<Car> optional = cars.stream().filter(p -> p.getId().equals(id)).findFirst();
        if (optional.isPresent()) {
            return optional.get();
        }
        return  null;
    }

    @Override
    @PostConstruct
    public void build() {
        cars.add(new Car("1", CarType.PORSHE, "Red") );
        cars.add(new Car("2", CarType.PORSHE, "Red") );
        cars.add(new Car("3", CarType.FERRARI, "Red") );

    }
}
