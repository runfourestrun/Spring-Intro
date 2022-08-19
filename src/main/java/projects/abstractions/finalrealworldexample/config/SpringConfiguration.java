package projects.abstractions.finalrealworldexample.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"projects.abstractions.finalrealworldexample.dao","projects.abstractions.finalrealworldexample.services","projects.abstractions.finalrealworldexample.proxies"})
public class SpringConfiguration {
}
