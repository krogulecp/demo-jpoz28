package pl.sda.spring.demo.validation;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.Size;

@RestController
@Validated
public class ValidationController {

    @GetMapping("/validation")
    public String validation(@Size(min = 3) @RequestParam String name){
        return "ok";
    }

    @PostMapping("/validation")
    public void validationPost(@Valid @RequestBody Person person){

    }
}
