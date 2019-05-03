package com.factory.carscreator.room;


import com.factory.carscreator.domain.Car;
import com.factory.carscreator.modelcar.CarType;
import org.springframework.stereotype.Component;

@Component
public class CarDesignerRoom {

    public Car PrepareDesignCar(CarType carType) {

        Car car = new Car(carType);

        return car;
    }

    public void PrepareColor(Car car, String color) {
        String bcolor = "beautiful " + color;
        car.setColor(bcolor);
    }

}
