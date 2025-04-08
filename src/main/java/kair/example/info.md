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

# 08.04.25
## Spting Init and Destroy methods
- `@PostConstruct` - method will be called after the bean is created and all dependencies are injected.
- `@PreDestroy` - method will be called before the bean is destroyed.

## Dependency Injection 
if my classes are dependent on each other, then i can't manually create them