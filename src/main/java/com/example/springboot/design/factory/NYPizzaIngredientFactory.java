package com.example.springboot.design.factory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggies = {new Garlic(),new Onion()};
        return veggies;
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
}
