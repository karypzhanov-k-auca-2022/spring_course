package kair.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Scope("prototype")
public class House {
    private String name;
    private Person person;
    private Pet pet;

    @Autowired
    public House(Person person, @Qualifier("dog") Pet pet, @Value("Default House") String name) {
        this.person = person;
        this.pet = pet;
        this.name = name;
        System.out.println("House constructor with name: " + name);
    }
    
    @PostConstruct
    public void init() {
        System.out.println("House bean is initialized, name: " + name);
    }
    
    @PreDestroy
    public void destroy() {
        System.out.println("House bean is destroyed, name: " + name);
    }

    public Person getPerson() {
        return person;
    }

    public Pet getPet() {
        return pet;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "House{name='" + name + "', person=" + person + ", pet=" + pet + "}";
    }
}
