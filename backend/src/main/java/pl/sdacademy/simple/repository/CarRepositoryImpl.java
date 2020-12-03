package pl.sdacademy.simple.repository;

import pl.sdacademy.simple.data.CarEntity;

import javax.persistence.EntityManager;
import java.util.List;

public class CarRepositoryImpl implements CarRepository {
    private final EntityManager entityManager;

    public CarRepositoryImpl(EntityManager entityManager) {

        this.entityManager = entityManager;
    }


    @Override
    public List<CarEntity> getCars() {

        return entityManager.createQuery("FROM CarEntity", CarEntity.class).getResultList();
    }


}
