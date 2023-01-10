package ro.sda.spring.di_1.components;

import org.springframework.stereotype.Component;

@Component
public class Cow {
    public void sayMu(){
        System.out.println("Muu");
    }
}
