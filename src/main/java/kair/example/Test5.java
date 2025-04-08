package kair.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("kair.example");

        Dog myDog1 = context.getBean(Dog.class);
        myDog1.setName("Bobik");
        
        Dog myDog2 = context.getBean(Dog.class);
        myDog2.setName("Charlie");

        System.out.println(myDog1);
        System.out.println(myDog2);

        myDog1.say();
        myDog2.say();
        System.out.println("------------------");

        Cat myCat1 = context.getBean(Cat.class);
        System.out.println("Cat1 initial name: " + myCat1.getName());
        
        Cat myCat2 = context.getBean(Cat.class);
        myCat2.setName("Mittens");

        System.out.println(myCat1);
        System.out.println(myCat2);

        myCat1.say();
        myCat2.say();

        context.close();
    }
}
