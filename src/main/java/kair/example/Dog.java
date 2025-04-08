package kair.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
@Scope("prototype")
public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("Dog default constructor");
    }

    @Autowired(required = false)
    public Dog(String name) {
        this.name = name;
        System.out.println("Dog constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void say() {
        System.out.println("Woof! My name is " + name);
    }

    @Override
    public String toString() {
        return "Dog{name='" + name + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }
}
