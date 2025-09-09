package com.rk.decoratorpattern;

public class Main {

    public static void main(String[] args) {

        BasePizza basePizza = new ExtraCheese(new Mushroom(new FarmHouse()));

        System.out.println(basePizza.cost());
    }
}
