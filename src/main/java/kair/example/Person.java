package kair.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.w3c.dom.ls.LSOutput;

@Component
public class Person {
    private String name;
    private final Pet pet;

    @Autowired
    public Person(@Qualifier("cat") Pet pet) {
        this.name = "Jack";
        this.pet = pet;
        System.out.println("Person constructor");
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', pet=" + pet + "}";
    }

    public void callYourPet() {
        System.out.println("Hello, my pet!");
        pet.say();
    }
}
