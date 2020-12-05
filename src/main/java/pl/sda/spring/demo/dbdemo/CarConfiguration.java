package pl.sda.spring.demo.dbdemo;

import lombok.val;
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
        CarEntity ford = new CarEntity();
        ford.setMake("Ford");
        ford.setModel("Mustang");

        CarEntity fiat = new CarEntity();
        fiat.setMake("Fiat");
        fiat.setModel("125P");

        carRepository.save(ford);
        carRepository.save(fiat);
    }
}
