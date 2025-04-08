package kair.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import java.util.Objects;

@Component("dog")
@Scope("prototype")
public class Dog implements Pet {
    private String name;

    @Autowired
    public Dog(@Value("Default Dog name") String name) {
        this.name = name;
        System.out.println("Dog constructor with name: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @PostConstruct
    public void init() {
        System.out.println("Dog bean is initialized");
    }
    
    @PreDestroy
    public void destroy() {
        System.out.println("Dog bean is destroyed");
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
