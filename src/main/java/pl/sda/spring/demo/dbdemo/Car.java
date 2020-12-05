package pl.sda.spring.demo.dbdemo;

import lombok.Value;

@Value
public class Car {
    String make;
    String model;

    public static Car fromCarEntity(CarEntity carEntity){
        return new Car(carEntity.getMake(), carEntity.getModel());
    }
}
