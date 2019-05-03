package com.factory.carscreator.controllers;

import com.factory.carscreator.domain.Car;
import com.factory.carscreator.domain.repository.CarRepository;
import com.factory.carscreator.domain.repository.InMemoryCarRepository;
import com.factory.carscreator.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class CarsController {

    @Autowired
    CarService carService;

    @RequestMapping("/carinfo")
    public String getCarInfo(Model model) {

        List<Car> list = (List<Car>) carService.getCars();
        model.addAttribute("listcars", list);
        return "cartemplate";
    }

}
