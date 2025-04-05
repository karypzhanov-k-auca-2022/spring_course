package kair.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("kair.example");

        House house1 = context.getBean(House.class);

        House house2 = context.getBean(House.class);


        System.out.println(house1.getPerson());
        System.out.println(house2.getPerson());
    }
}
