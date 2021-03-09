package com.example.springboot.design.factory;

public class CheesePizza extends Pizza{

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("preparing..." + name);
        dough = pizzaIngredientFactory.createDough();
        clams = pizzaIngredientFactory.createClams();
        pepperoni = pizzaIngredientFactory.createPepperoni();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
        sauce = pizzaIngredientFactory.createSauce();
    }
}
