package pl.sdacademy.simple.service;

import pl.sdacademy.simple.data.CarAttributeEntity;
import pl.sdacademy.simple.data.CarEntity;
import pl.sdacademy.simple.repository.CarFilterAssembler;
import pl.sdacademy.simple.repository.CarRepositoryImpl;
import pl.sdacademy.simple.util.DatabaseUtil;
import java.util.List;


public class CarServiceImpl implements CarService {


    @Override
    public void findAllcars() {
        CarRepositoryImpl carRepository = new CarRepositoryImpl(DatabaseUtil.getEntityManager());
        List<CarEntity> carEntityList = carRepository.getCars();
        System.out.println("Wszystkie samochody, które posiada wypożyczalnia: ");
        for (CarEntity car : carEntityList) {
            System.out.println();
            System.out.print(car.getProducer());
            System.out.println(" " + car.getModel());
            System.out.print("Cena: " + car.getPrice());
            System.out.println("Kolor: " + car.getColour());

        }
    }

    @Override
    public void findCarsWithAttributes() {
        CarFilterAssembler carFilterAssembler = new CarFilterAssembler(DatabaseUtil.getEntityManager());
        List<CarEntity> carEntityList = carFilterAssembler.findAllCarswithAttributes("gps");
        for (CarEntity car : carEntityList) {
            System.out.println();
            System.out.print(car.getProducer());
            System.out.println(" " + car.getModel());
            System.out.print("Cena: " + car.getPrice());
            System.out.println("Kolor: " + car.getColour());
        }
    }
}

