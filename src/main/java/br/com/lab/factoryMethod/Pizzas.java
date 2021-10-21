package br.com.lab.factoryMethod;

public enum Pizzas {
    CHEESE(new CheesePizzaFactory()),
    VEGGIE(new VeggieFactory());
    BasePizzaFactory factory;
    Pizzas(BasePizzaFactory pizzaFactory) {
        this.factory=pizzaFactory;
    }
    public BasePizzaFactory getFactory(){
       return this.factory;
    }

}

