package projects.abstractions.realworldalexattempt2;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"projects.abstractions.realworldalexattempt2.services.dao","projects.abstractions.realworldalexattempt2.services","projects.abstractions.realworldalexattempt2.proxies"})
public class SpringConfiguration {

}
