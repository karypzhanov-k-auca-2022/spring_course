package kair.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("kair.example");

        House house = context.getBean(House.class);
        Person person = context.getBean(Person.class);
        Pet pet = context.getBean("cat", Pet.class);

        System.out.println(house.getPerson());
    }
}
