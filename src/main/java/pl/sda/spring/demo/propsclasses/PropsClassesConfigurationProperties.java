package pl.sda.spring.demo.propsclasses;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "demo.props.classes")
public class PropsClassesConfigurationProperties {

    /**
     * My custom prop for demo of configuration properties
     */
    String value = "Hello";
}
