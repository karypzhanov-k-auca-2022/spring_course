package kair.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test7 {
    public static void main(String[] args) {
        // Создаем контекст Spring на основе пакета с компонентами
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext("kair.example");
        
        try {
            // Получаем бин House из контейнера Spring
            House myHouse = context.getBean(House.class);
            
            // Устанавливаем имя дома
            myHouse.setName("My Wonderful House");
            
            // Выводим информацию о доме
            System.out.println("House details:");
            System.out.println(myHouse);
            
            // Получаем и выводим информацию о жильце дома
            Person resident = myHouse.getPerson();
            System.out.println("Resident: " + resident);
            
            // Получаем и выводим информацию о питомце
            Pet pet = myHouse.getPet();
            System.out.println("Pet says: ");
            pet.say();
        } finally {
            // Закрываем контекст для корректного освобождения ресурсов
            context.close();
        }
    }
}
