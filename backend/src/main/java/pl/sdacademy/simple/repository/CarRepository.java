package pl.sdacademy.simple.repository;

import pl.sdacademy.simple.data.CarEntity;
import pl.sdacademy.simple.model.CarParameter;

import java.util.List;

public interface CarRepository {
    List<CarEntity> getCars();
}
