package com.factory.carscreator.room;

import com.factory.carscreator.data.Car;
import com.factory.carscreator.modelcar.CarType;
import org.springframework.stereotype.Component;

@Component
public class CarDesignerRoom {

    public Car PrepareDesignCar(CarType carType) {

        Car car = new Car();

        if (CarType.MERCEDES == carType){
            car.setName("mercedes");
        } else if (CarType.PORSHE == carType) {
            car.setName("porshe");
        } else if (CarType.FERRARI == carType) {
            car.setName("ferrari");
        }

        return car;
    }

    public void PrepareColor(Car car, String color) {
        String bcolor = "beautiful " + color;
        car.setColor(bcolor);
    }

}
