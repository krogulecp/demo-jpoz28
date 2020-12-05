package pl.sda.spring.demo.dbdemo;

import org.springframework.stereotype.Service;

@Service
public class CarService {

    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car getCar(Long id) {
        return carRepository.findById(id)
                .map(Car::fromCarEntity)
                .orElse(null);
    }
}
