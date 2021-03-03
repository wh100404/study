package com.example.springboot.design.decorator;

public class StarbuzzCoffee {

    public static void main(String[] args) {
        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.cost());

        Beverage dazkRoast = new DazkRoast();
        dazkRoast = new Mocha(dazkRoast);
        dazkRoast = new Mocha(dazkRoast);
        dazkRoast = new Whip(dazkRoast);
        System.out.println(dazkRoast.getDescription() + " $" + dazkRoast.cost());

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Whip(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        System.out.println(houseBlend.getDescription() + " $" + houseBlend.cost());
    }
}
