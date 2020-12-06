package pl.sda.spring.demo.dbdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
class CarRepositoryTest {

    @Autowired
    private CarRepository carRepository;

    @Test
    void should_find_car(){
        //given
        final CarEntity fiat = new CarEntity(null, "Fiat", "126P");
        carRepository.save(fiat);

        //when
        final List<CarEntity> result = carRepository.findByModel("126P");

        //then
        assertThat(result.size()).isEqualTo(1);
        final CarEntity carEntity = result.get(0);
        assertThat(carEntity.getMake()).isEqualTo("Fiat");
        assertThat(carEntity.getModel()).isEqualTo("126P");
    }
}
