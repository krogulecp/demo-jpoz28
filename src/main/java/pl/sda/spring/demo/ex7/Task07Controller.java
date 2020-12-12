package pl.sda.spring.demo.ex7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Task07Controller {

    @GetMapping("/task07")
    public void task07(){
        throw new CustomException();
    }
}
