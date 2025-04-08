package kair.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("kair.example");

        Dog myDog1 = context.getBean(Dog.class);
        myDog1.setName("Buddy");

        Dog myDog2 = context.getBean(Dog.class);
        myDog2.setName("Charlie");

        System.out.println(myDog1);
        System.out.println(myDog2);
        
        context.close(); // закрываем контекст для освобождения ресурсов
    }
}
