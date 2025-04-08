package kair.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HouseTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("kair.example");

        // Получаем бин House с параметрами по умолчанию
        House house1 = context.getBean(House.class);
        System.out.println("House1 details:");
        System.out.println("House name: " + house1.getName());
        System.out.println("Person: " + house1.getPerson());
        System.out.println("Pet: " + house1.getPet());
        
        // Создаем второй экземпляр House и изменяем его имя
        House house2 = context.getBean(House.class);
        house2.setName("Beach House");
        
        System.out.println("\nHouse2 details:");
        System.out.println("House name: " + house2.getName());
        System.out.println("Person: " + house2.getPerson());
        System.out.println("Pet: " + house2.getPet());
        
        // Демонстрируем, что два бина независимы (благодаря @Scope("prototype"))
        System.out.println("\nAre houses the same object? " + (house1 == house2));
        System.out.println("House1: " + house1);
        System.out.println("House2: " + house2);
        
        // Закрываем контекст
        context.close();
    }
}