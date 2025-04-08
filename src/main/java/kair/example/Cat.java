package kair.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("cat")
@Scope("prototype")
public class Cat implements Pet {
    private String name;

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

    void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
