package ro.sda.spring.di_1;

import ro.sda.spring.di_1.beans.Cat;
import ro.sda.spring.di_1.components.Cow;
import ro.sda.spring.di_1.components.Dog;
import ro.sda.spring.di_1.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Cat c1 = context.getBean(Cat.class);
        c1.sayMeow();

        Dog d1 = context.getBean(Dog.class);
        d1.sayHam();

        Cow c2 = context.getBean(Cow.class);
        c2.sayMu();
    }
}
