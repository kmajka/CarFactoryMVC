package com.factory.carscreator.controllers;

import com.factory.carscreator.data.Car;
import com.factory.carscreator.room.CarBuildRoom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @Autowired
    CarBuildRoom carBuildRoom;

    @RequestMapping("/carinfo")
    public String getCarInfo(Model model) {

        List<Car> list = new ArrayList<Car>();
        list.add(carBuildRoom.GetFerrariCar());
        list.add(carBuildRoom.GetPorsheCar());
        model.addAttribute("listcars", list);
        return "cartemplate";
    }

}
