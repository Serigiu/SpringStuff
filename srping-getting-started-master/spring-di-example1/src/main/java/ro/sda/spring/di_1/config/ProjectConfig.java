package ro.sda.spring.di_1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring.di_1.beans.Cat;
import ro.sda.spring.di_1.components.Dog;

/*@Configuration;
@ComponentScan("ro.sda.spring.di_1.config");*/
import java.beans.BeanProperty;

public class ProjectConfig {

    @Bean
    public Cat cat() {

        return new Cat();
    }

    @Bean
    public Dog dog_22222() {

        return new Dog();
    }
}