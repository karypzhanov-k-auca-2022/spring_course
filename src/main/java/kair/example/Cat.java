package kair.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("cat")
@Scope("prototype")
public class Cat implements Pet {
    private String name;

    @Autowired
    public Cat(@Value("Default Cat name") String name) {
        this.name = name;
        System.out.println("Cat constructor with name: " + name);
    }
    
    @PostConstruct
    public void init() {
        System.out.println("Cat bean is initialized");
    }
    
    @PreDestroy
    public void destroy() {
        System.out.println("Cat bean is destroyed");
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

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
