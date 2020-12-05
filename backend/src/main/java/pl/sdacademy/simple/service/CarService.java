package pl.sdacademy.simple.service;

import pl.sdacademy.simple.data.CarEntity;
import pl.sdacademy.simple.model.CarParameter;
import pl.sdacademy.simple.repository.CarRepositoryImpl;
import pl.sdacademy.simple.util.DatabaseUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public interface CarService {
 void findAllcars();
 void findCarsWithAttributes();

}
