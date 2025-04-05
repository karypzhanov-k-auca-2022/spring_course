package kair.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class House {
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
