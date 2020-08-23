package com.company;

public class Hero {

    public static int heroesCount = 0;

    private String name = "Piotr";
    private String sex = "Mezczyzna";
    private byte hp = 100;
    private int st = 10;

    public Hero() {
        System.out.println("Przed wywolaniem konstruktora" + heroesCount);
        heroesCount++;
        System.out.println("Po wywolaniu konstruktora" + heroesCount);
    }

    public void printinfo() {
        heroesCount++;

        System.out.println("Statyki: " + name + "\nPłeć: " + sex + "\nZdrowie " + hp + "\nSiła: " + st);
        printinfo();

        if (heroesCount >= 100) {
            System.out.println("zatrzymaj to");
        }
    }

    public void setName(String name) {
        this.name = name;
    }
}