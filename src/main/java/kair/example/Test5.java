package kair.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("kair.example");

        Dog myDog1 = context.getBean(Dog.class);
        Dog myDog2 = context.getBean(Dog.class);


    }


}
