package kair.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//        Pet pet = new Cat();
        // application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("kair.example");
        // get bean
        Pet pet1 = context.getBean("cat", Pet.class);
        Pet pet2 = context.getBean("dog", Pet.class);


        Person person = new Person(pet1);
        person.callYourPet();

        Person person2 = new Person(pet2);
        person2.callYourPet();
    }
}