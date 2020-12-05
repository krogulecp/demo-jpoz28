package pl.sda.spring.demo.dbdemo;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class CarConfiguration {

    private final CarRepository carRepository;

    public CarConfiguration(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @PostConstruct
    public void saveCarsToRepository(){

    }
}
