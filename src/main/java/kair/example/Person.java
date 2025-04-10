package kair.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;
    private final Pet pet;

    @Autowired
    public Person(@Qualifier("cat") Pet pet) {
        this.pet = pet;
        System.out.println("Person constructor");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pet=" + pet +
                '}';
    }

    public void callYourPet() {
        System.out.println("Hello, my pet!");
        pet.say();
    }
}
