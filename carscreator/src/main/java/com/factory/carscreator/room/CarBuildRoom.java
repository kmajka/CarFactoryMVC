package com.factory.carscreator.room;

import com.factory.carscreator.domain.Car;
import com.factory.carscreator.modelcar.CarType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CarBuildRoom {

    @Autowired
    CarDesignerRoom carDesignerRoom;

    public Car GetFerrariCar() {
        Car car = carDesignerRoom.PrepareDesignCar(CarType.FERRARI);
        carDesignerRoom.PrepareColor(car, "Red");
        return car;
    }

    public Car GetPorsheCar() {
        Car car = carDesignerRoom.PrepareDesignCar(CarType.PORSHE);
        carDesignerRoom.PrepareColor(car, "Silver");
        return car;
    }

}
