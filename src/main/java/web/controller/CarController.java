package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping()
    public String snowShortCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> carList = carService.index();
        if (count != null) {
            if (count < 5) {
                carList = carService.shortListCars(count);
            }
        }
        model.addAttribute("cars", carList);
        return "cars";
    }
}
