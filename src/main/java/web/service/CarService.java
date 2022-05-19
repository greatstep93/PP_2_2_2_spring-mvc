package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Component
public class CarService {
    private static List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW X5", "Black", 2018));
        carList.add(new Car("AUDI A3", "White", 2010));
        carList.add(new Car("Toyota Corolla", "Green", 2010));
        carList.add(new Car("VAZ 2110", "Red", 2001));
        carList.add(new Car("Nissan Almera", "Yellow", 2005));

    }
    public List<Car> index(){
        return carList;
    }

    public List<Car> shortListCars(int count){
        List<Car> carListShort = new ArrayList<>(count);
        for(int i = 0;i<count;i++){
            carListShort.add(carList.get(i));
        }
        return carListShort;
    }

}
