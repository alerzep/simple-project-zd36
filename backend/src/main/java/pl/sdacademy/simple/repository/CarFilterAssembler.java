package pl.sdacademy.simple.repository;

import pl.sdacademy.simple.data.CarEntity;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class CarFilterAssembler {

    private final EntityManager entityManager;

    public CarFilterAssembler(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<CarEntity> findAllCarswithAttributes(String attribute) {

        return entityManager.createQuery("FROM CarEntity c LEFT JOIN FETCH c.attributes WHERE attribute=:attribute", CarEntity.class)
                .setParameter("attribute", attribute)
                .getResultList();
    }

    public List<CarEntity> findAllCarsByColor(String colour) {

        return entityManager.createQuery("FROM CarEntity WHERE colour=:colour", CarEntity.class)
                .setParameter("colour", colour)
                .getResultList();
    }
    public List<CarEntity> findAllCarsByProducer(String producer) {

        return entityManager.createQuery("FROM CarEntity WHERE producer=:producer", CarEntity.class)
                .setParameter("producer", producer)
                .getResultList();
    }

    public List<CarEntity> findAllCarsByModel(String model) {

        return entityManager.createQuery("FROM CarEntity WHERE model=:model", CarEntity.class)
                .setParameter("model", model)
                .getResultList();
    }

    public List<CarEntity> findAllCarsModel(String model) {

        return entityManager.createQuery("FROM CarEntity WHERE model=:model", CarEntity.class)
                .setParameter("model", model)
                .getResultList();
    }

    public List<CarEntity> findAllCarsWithAutomatic(Byte automatic) {

        return entityManager.createQuery("FROM CarEntity WHERE automatic=:automatic", CarEntity.class)
                .setParameter("automatic", automatic)
                .getResultList();
    }

    public List<CarEntity> findAllCarsPriceMax(BigDecimal price) {

        return entityManager.createQuery("FROM CarEntity WHERE price<=:model", CarEntity.class)
                .setParameter("price", price)
                .getResultList();
    }
}
