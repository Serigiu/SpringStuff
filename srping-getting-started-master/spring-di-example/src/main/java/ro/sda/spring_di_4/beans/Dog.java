package ro.sda.spring_di_4.beans;

import org.springframework.stereotype.Component;

@Component
public class Dog {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}