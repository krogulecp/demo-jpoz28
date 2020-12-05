package pl.sda.spring.demo.ex5props;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(Task05AdvancedProperties.class)
public class Task05PropsController {

    private final String myValue;
    private final Task05AdvancedProperties task05AdvancedProperties;

    Task05PropsController(@Value("${task05.props.value}") String myValue, Task05AdvancedProperties task05AdvancedProperties){
        this.myValue = myValue;
        this.task05AdvancedProperties = task05AdvancedProperties;
    }
}
