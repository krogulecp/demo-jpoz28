package pl.sda.spring.demo.ex6;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimalRepository extends JpaRepository<AnimalEntity, Long> {

    List<AnimalEntity> findByAgeGreaterThanAndNameContains(int age, String namePart);
}
