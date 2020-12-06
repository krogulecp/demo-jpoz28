package pl.sda.spring.demo.dbdemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CarControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private CarRepository carRepository;

    @Test
    void should_return_404_when_car_is_not_found(){
        //given
        assert (carRepository.count() == 0);

        //when
        final ResponseEntity<Car> carResult = testRestTemplate.getForEntity("/cars/1", Car.class);

        //then
        assertThat(carResult.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }

    @Test
    void should_return_car_when_it_exists_in_repository(){
        //given
        carRepository.save(new CarEntity(1L, "Fiat", "126P"));

        //when
        final ResponseEntity<Car> carResult = testRestTemplate.getForEntity("/cars/1", Car.class);

        //then
        assertThat(carResult.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(carResult.getBody()).isNotNull();
        assertThat(carResult.getBody().getMake()).isEqualTo("Fiat");
        assertThat(carResult.getBody().getModel()).isEqualTo("126P");
    }

    @Test
    void should_save_car_in_repository(){
        //given
        testRestTemplate.postForEntity("/cars", new Car("Fiat", "125P"), Void.class);

        //when
        final List<CarEntity> cars = carRepository.findAll();

        //then
        assertThat(cars.size()).isEqualTo(1);
    }

    @Test
    void should_save_car_and_get_it_with_api(){
        //given


        //when


        //then
    }
}
