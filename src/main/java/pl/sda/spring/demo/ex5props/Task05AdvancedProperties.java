package pl.sda.spring.demo.ex5props;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

import java.util.HashMap;
import java.util.Map;

@Data
@ConfigurationProperties("task05.advanced")
public class Task05AdvancedProperties {

    @NestedConfigurationProperty
    private Map<String, Film> films = new HashMap<>();
}
