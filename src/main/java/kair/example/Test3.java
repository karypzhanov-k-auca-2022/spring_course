package kair.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//        Pet pet = new Cat();
        // application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("kair.example");


        Person person = context.getBean(Person.class);
        person.callYourPet();
    }
}