package kair.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Pet {
    private final String name;

    @Autowired
    public Dog() {
        this.name = "Buddy";
        System.out.println("Dog constructor");
    }

    @Override
    public void say() {
        System.out.println("Woof! My name is " + name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
