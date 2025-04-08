package kair.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class House {
    private String name;
    private Person person;
    private Pet pet;

    @Autowired
    public House(Person person, @Qualifier("cat") Pet pet) {
        this.person = person;
        this.pet = pet;
        System.out.println("House constructor");
    }

    public Person getPerson() {
        return person;
    }

    public Pet getPet() {
        return pet;
    }
}
