package projects.abstractions.realworldBook;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"projects.abstractions.realworldBook.services","projects.abstractions.realworldBook.proxy","projects.abstractions.realworldBook.dao"})
public class SpringConfiguration {
}
