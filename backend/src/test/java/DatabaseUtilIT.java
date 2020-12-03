import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.sdacademy.simple.data.CarEntity;
import pl.sdacademy.simple.util.DatabaseUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DatabaseUtilIT {
private EntityManager entityManager;

    @BeforeEach
    void setUp() {
        entityManager = DatabaseUtil.getEntityManager();
    }

    @Test
    void shouldFindCars() {
        Query query = entityManager.createQuery("SELECT car FROM CarEntity car", CarEntity.class);
        List<CarEntity> result = query.getResultList();

        assertThat(result).hasSize(8);
        assertThat(result.get(0).getAttributes()).hasSize(2);
        assertThat(result.get(1).getPrice()).isEqualTo(BigDecimal.valueOf(7.5));
    }
}