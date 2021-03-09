package com.example.springboot.design.factory;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Clams createClams();
    public Pepperoni createPepperoni();
    public Veggies[] createVeggies();
    public Cheese createCheese();
}
