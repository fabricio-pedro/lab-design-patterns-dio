package br.com.lab;

import br.com.lab.adapter.FormatterAdapter;
import br.com.lab.factoryMethod.BasePizzaFactory;
import br.com.lab.factoryMethod.Pizzas;
import br.com.lab.formatters.CscFormatter;
import br.com.lab.formatters.NewLineFormatter;
import br.com.lab.formatters.TextFormattable;
import br.com.lab.pizzas.Pizza;

import java.util.Locale;

import static br.com.lab.factoryMethod.Pizzas.CHEESE;
import static br.com.lab.factoryMethod.Pizzas.VEGGIE;

public class App 
{
    public static void main( String[] args )
    {
      // Exemplo de design pattern adapter
        String tipo="cheese";
        String testString=" Formatting line 1. Formatting line 2. Formatting line 3.";
        TextFormattable formatter=new NewLineFormatter();
        System.out.print(formatter.formatText(testString));
        FormatterAdapter formatterAdapter=new FormatterAdapter(new CscFormatter());
        System.out.println(formatterAdapter.formatText(testString));
      //Exemplo de design pattern Factory Method
        BasePizzaFactory factory;
        if(tipo.equals(CHEESE.name().toLowerCase())){
            factory=CHEESE.getFactory();
        }else{
            factory=VEGGIE.getFactory();
        }
        Pizza pizza= factory.createPizza();
        pizza.addIngredients();
    }
}
