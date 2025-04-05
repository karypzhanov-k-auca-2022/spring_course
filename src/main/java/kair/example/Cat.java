package kair.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component("cat")
public class Cat implements Pet {

    @Autowired
    public Cat() {
        System.out.println("Cat constructor");
    }
    @Override
    public void say() {
        System.out.println("Meow!");
    }
}
