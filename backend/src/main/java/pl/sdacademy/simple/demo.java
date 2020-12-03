package pl.sdacademy.simple;

import pl.sdacademy.simple.service.CarServiceImpl;


public class demo {
    public static void main(String[] args) {
        CarServiceImpl carService = new CarServiceImpl();
        carService.findCarsWithAttributes();

    }
}
