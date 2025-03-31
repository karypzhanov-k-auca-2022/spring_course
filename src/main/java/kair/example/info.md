# 31.03.25
## Spring Container main functions
1. `IoC` (`Inversion of Control`) - Spring manages the lifecycle of objects.
2. `DI` (`Dependency Injection`) - Spring injects dependencies into objects.

## Ways of configuring Spring Container
1. XML file (old way)
2. Annotation + XML file
3. Java code (modern way)

## Dependency Injection
Solve the problem
1. `Employee` -> `Car`, `House`, `Pet` -> `House` class has `Window`, `Door`, `Roof`, etc.

```
Employee employee = new Employee();
Car car = new Car();
employee.setCar(car);
House house = new House();
Door door = new Door();
house.setDoor(door);
employee.setHouse(house);
```