package projects.abstractions.realworldstereotypes.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"projects.abstractions.realworldstereotypes.repository","projects.abstractions.realworldstereotypes.services","projects.abstractions.realworldstereotypes.proxies"})
public class NewSpringConfiguration {
}
