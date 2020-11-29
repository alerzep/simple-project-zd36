package pl.sdacademy.simple.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    int ID;
    String producer;
    String model;
    String colour;
    int price;
    boolean automatic;

}
