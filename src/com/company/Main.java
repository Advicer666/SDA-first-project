package com.company;

public class Main {

    public static void main(String[] args) {
        Hero gracz = new Hero();
        Hero gracz2 = new Hero();

        gracz.setName("Gandalf");
        gracz2.setName("Bogdan");

        gracz.printinfo();
        gracz2.printinfo();

        System.out.println(gracz.toString());
        System.out.println(gracz2.toString());
    }
}