package kair.example;


import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:myApp.properties")
public class ConfigurationProperties {

}
