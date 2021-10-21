package br.com.lab.factoryMethod;

import br.com.lab.pizzas.Pizza;
import br.com.lab.pizzas.VeggiePizza;

public class VeggieFactory extends BasePizzaFactory{
    @Override
    public Pizza createPizza() {
        return new VeggiePizza();
    }
}
