package ro.sda.spring.di_2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring.di_2.beans.Dog;
import ro.sda.spring.di_2.beans.Owner;

@Configuration
@ComponentScan("ro.sda.spring.di_2.beans")
public class ProjectConfig {
//    @Bean
//    public Owner owner() {
//        Owner o = new Owner();
//        o.setName("Catalin");
//        return o;
//    }

    @Bean
    public Dog dog() {
        Dog d = new Dog("Max");
        return d;
    }
}
