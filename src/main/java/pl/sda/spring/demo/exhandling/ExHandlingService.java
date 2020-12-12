package pl.sda.spring.demo.exhandling;

import org.springframework.stereotype.Service;

@Service
public class ExHandlingService {
    public String go() {
        throw new MyServiceBusinessException("Something went wrong...");
    }
}
