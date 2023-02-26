package com.example.animals;

public class Horse extends Animal {
    private String gait;

    public  static  String horseName = "Лошадь";

    public static String getHorseName() {
        return horseName;
    }

    public static void setHorseName(String horseName) {
        Horse.horseName = horseName;
    }

    public Horse() {
    }

    public Horse(String gait) {
        this.gait = gait;
    }

    public String getGait() {
        return gait;
    }

    public void setGait(String gait) {
        this.gait = gait;
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
