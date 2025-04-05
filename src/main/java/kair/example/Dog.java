package kair.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("dog")
public class Dog implements Pet {

    @Autowired
    public Dog() {
        System.out.println("Dog constructor");
    }

    @Override
    public void say() {
        System.out.println("Woof!");
    }
}
