package com.factory.carscreator;

import com.factory.carscreator.domain.Car;
import com.factory.carscreator.room.CarBuildRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarsCreatorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CarsCreatorApplication.class, args);
		System.out.println("start");
	}

	@Autowired
	CarBuildRoom carBuildRoom;

	@Override
	public void run(String... args) throws Exception {
		Car car = carBuildRoom.GetFerrariCar();
		System.out.println(car);
	}
}
