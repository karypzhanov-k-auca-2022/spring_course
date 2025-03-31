package kair.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//        Pet pet = new Cat();
        // application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("kair.example");
        // get bean
        Pet pet = context.getBean(Pet.class);

        Person person = new Person(pet);
        person.callYourPet();
    }
}
