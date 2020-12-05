package pl.sda.spring.demo.dbdemo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class CarEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String make;
    private String model;
}
