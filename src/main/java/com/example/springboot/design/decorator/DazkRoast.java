package com.example.springboot.design.decorator;

public class DazkRoast extends Beverage{

    public DazkRoast() {
        description = "DazkRoast";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
