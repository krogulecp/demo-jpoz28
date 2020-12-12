package pl.sda.spring.demo.ex8;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class AnimalValidationController {

    @PostMapping("/animal-validation")
    public void animalValidation(@Valid @RequestBody AnimalRequest animalRequest){

    }
}
