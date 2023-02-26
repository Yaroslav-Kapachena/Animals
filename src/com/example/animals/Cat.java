package com.example.animals;

public class Cat extends Animal {
    private String character;

    public static String catName = "Кот";

    public static String getCatName() {
        return catName;
    }

    public static void setCatName(String catName) {
        Cat.catName = catName;
    }

    public Cat() {
    }

    public Cat(String character) {
        this.character = character;
    }


    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meu,Meu");
    }

    @Override
    public void eat() {
        System.out.println("I like to eat meat");
    }

    @Override
    public void sleep() {
        System.out.println("I sleep about 12 hours a day");
    }
}
