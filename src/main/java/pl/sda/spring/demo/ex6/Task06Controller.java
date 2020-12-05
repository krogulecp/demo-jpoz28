package pl.sda.spring.demo.ex6;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.sda.spring.demo.util.Animal;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class Task06Controller {

    private final AnimalRepository animalRepository;

    public Task06Controller(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @PostMapping("/task06")
    public ResponseEntity<Void> createAnimal(@RequestBody Animal animal){
        animalRepository.save(AnimalEntity.fromAnimal(animal));
        return ResponseEntity.ok().build();
    }

    @GetMapping("/task06")
    public ResponseEntity<List<Animal>> getAllAnimals(){
        final List<Animal> animals = animalRepository.findAll().stream()
                .map(animalEntity -> new Animal(animalEntity.getName(), animalEntity.getAge()))
                .collect(Collectors.toList());

        return ResponseEntity.ok()
                .body(animals);
    }

    @GetMapping("/task06.2")
    public ResponseEntity<List<Animal>> getAnimals(@RequestParam("ageGreaterThan") int ageGreaterThan,
                                                   @RequestParam("nameContains") String nameContains){
        final List<Animal> animals = animalRepository.findByAgeGreaterThanAndNameContains(ageGreaterThan, nameContains).stream()
                .map(animalEntity -> new Animal(animalEntity.getName(), animalEntity.getAge()))
                .collect(Collectors.toList());

        return ResponseEntity.ok(animals);
    }
}
