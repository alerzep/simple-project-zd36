package pl.sdacademy.simple.repository;

import pl.sdacademy.simple.data.CarEntity;

import javax.persistence.EntityManager;
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
}
