package pl.sdacademy.simple.data;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Set;

@Getter
@Setter
@ToString
public class CarDto {
    private long id;
    private String producer;
    private String model;
    private String colour;
    private BigDecimal price;
    private Byte automatic;
    private Set<CarAttributeEntity> attributes;

}
