package pl.sda.spring.demo.dbdemo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class CarRepositoryTest {

    @Autowired
    private CarRepository carRepository;

    @BeforeEach
    void setUpCars(){
        final CarEntity fiat126 = new CarEntity(null, "Fiat", "126P");
        final CarEntity fiat500 = new CarEntity(null, "Fiat", "500");
        final CarEntity ford = new CarEntity(null, "Ford", "Escort");

        carRepository.saveAll(List.of(fiat126, fiat500, ford));
    }

    @Test
    void should_find_car(){
        //when
        final List<CarEntity> result = carRepository.findByModel("126P");

        //then
        assertThat(result.size()).isEqualTo(1);
        final CarEntity carEntity = result.get(0);
        assertThat(carEntity.getMake()).isEqualTo("Fiat");
        assertThat(carEntity.getModel()).isEqualTo("126P");
    }

    @Test
    void should_find_car_by_make_and_model(){
        //when
        final List<CarEntity> result = carRepository.findByMakeAndModel("Ford", "Escort");

        //then
        assertThat(result.size()).isEqualTo(1);
        final CarEntity fordResult = result.get(0);
        assertThat(fordResult.getMake()).isEqualTo("Ford");
        assertThat(fordResult.getModel()).isEqualTo("Escort");
    }

    //napiszmy test, który zweryfikuje wyszukanie wszystkich samochodów
}
