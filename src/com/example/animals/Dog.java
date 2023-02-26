package com.example.animals;

public class Dog extends Animal {
    private String learnability;

    public  static  String dogName = "Собака";

    public static String getDogName() {
        return dogName;
    }

    public static void setDogName(String dogName) {
        Dog.dogName = dogName;
    }

    public Dog() {
    }

    public Dog(String learnability) {
        this.learnability = learnability;
    }


    public String getLearnability() {
        return learnability;
    }

    public void setLearnability(String learnability) {
        this.learnability = learnability;
    }

    @Override
    public void makeNoise() {
        System.out.println();
    }

    @Override
    public void eat() {
        System.out.println();
    }

    @Override
    public void sleep() {
        System.out.println();
    }
}
