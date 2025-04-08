package kair.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Pet {
    private final String name;

    @Autowired
    public Cat() {
        this.name = "Kitty";
        System.out.println("Cat constructor");
    }

    @Override
    public void say() {
        System.out.println("Meow! My name is " + name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
