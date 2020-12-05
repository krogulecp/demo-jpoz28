package pl.sda.spring.demo.ex6;

import lombok.Data;
import pl.sda.spring.demo.util.Animal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity(name = "Animal")
public class AnimalEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;

    public static AnimalEntity fromAnimal(Animal animal){
        AnimalEntity animalEntity = new AnimalEntity();
        animalEntity.name = animal.getName();
        animalEntity.age = animal.getAge();

        return animalEntity;
    }
}
