package pl.sda.spring.demo.exhandling;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ExHandlingController {

    private final ExHandlingService exHandlingService;

    @GetMapping("/ex-handling")
    public String exHandling(){
        return exHandlingService.go();
    }
}
