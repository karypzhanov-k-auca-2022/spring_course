package kair.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test7 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext("kair.example");

        try {
            House myHouse = context.getBean(House.class);

            myHouse.setName("Osobnyak");

            System.out.println("House details:");
            System.out.println(myHouse);

            Person resident = myHouse.getPerson();
            System.out.println("Resident: " + resident);

            Pet pet = myHouse.getPet();
            System.out.println("Pet says: ");
            pet.say();
        } finally {
            context.close();
        }
    }
}
