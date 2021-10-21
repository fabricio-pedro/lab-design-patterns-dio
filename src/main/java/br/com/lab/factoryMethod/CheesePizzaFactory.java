package br.com.lab.factoryMethod;

import br.com.lab.pizzas.CheesePizza;
import br.com.lab.pizzas.Pizza;

public class CheesePizzaFactory extends BasePizzaFactory{
    @Override
    public Pizza createPizza() {
        return new CheesePizza();
    }
}
