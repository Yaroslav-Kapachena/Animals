package com.example.animals;

public class TestLogic {
    public static void main(String[] args) {
        Animal animal1 = new Cat("Покладистый");
        Animal animal2 = new Dog("Легко поддается дрессировке");
        Animal animal3 = new Horse("Иноходь");

        Vet.treatAnimal(animal1);

        Cat cat1 = new Cat();

        Dog dog1 = new Dog();

        Horse horse1 = new Horse();

        Animal[] goToVetArray = {cat1,dog1,horse1};
        for(int i = 0;i< goToVetArray.length;i++){
            System.out.println("На осмотр должны прити "+goToVetArray[i]);
        }
    }
}
