package pl.sdacademy.simple.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class CarAttributeEntity {
    private long id;
    private String attribute;
}
