package pl.sda.spring.demo.propsclasses;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties(PropsClassesConfigurationProperties.class)
public class PropsClassesController {

    private final PropsClassesConfigurationProperties props;

    public PropsClassesController(PropsClassesConfigurationProperties props) {
        this.props = props;
    }

    @GetMapping("/props-classes")
    public String propsClasses(){
        return props.value;
    }
}
