package projects.abstractions.aspectorientedprogramming.aspectbasics.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
@ComponentScan(basePackages = {"projects.abstractions.aspectorientedprogramming.service","projects.abstractions.aspectorientedprogramming.repository","projects.abstractions.aspectorientedprogramming.aspects"})
public class SpringConfiguration {
}
