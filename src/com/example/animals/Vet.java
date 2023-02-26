package com.example.animals;

import java.awt.*;

public class Vet {
    public static void  treatAnimal(Animal animal){
        System.out.println(animal.getLocation()+" "+animal.getFood());
    }
}
