package pl.sda.spring.demo.dbdemo;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Optional<Car> getCar(Long id) {
        //logika biznesowa
        return carRepository.findById(id)
                .map(Car::fromCarEntity);
    }
}
