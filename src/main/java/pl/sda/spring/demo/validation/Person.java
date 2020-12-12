package pl.sda.spring.demo.validation;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Data
@Validated
public class Person {
    private String name;

    @Min(message = "Age must be more then 0", value = 0)
    @Max(value = 120, message = "Age must be under 120")
    private int age;
}
