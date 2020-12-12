package pl.sda.spring.demo.ex8;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Validated
public class AnimalRequest {

    @NotNull(message = "You must specify name")
    @Size(min = 3, message = "Name must be at least 3 letters long")
    private String name;

    @Min(value = 0, message = "Age must no be negative number")
    private int age;
}
