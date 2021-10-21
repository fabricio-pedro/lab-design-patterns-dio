package br.com.lab;

import br.com.lab.adapter.FormatterAdapter;
import br.com.lab.formatters.CscFormatter;
import br.com.lab.formatters.NewLineFormatter;
import br.com.lab.formatters.TextFormattable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      // Exemplo de design pattern adapter
        String testString=" Formatting line 1. Formatting line 2. Formatting line 3.";
        TextFormattable formatter=new NewLineFormatter();
        System.out.print(formatter.formatText(testString));
        FormatterAdapter formatterAdapter=new FormatterAdapter(new CscFormatter());
        TextFormattable formatter2=formatterAdapter;
        System.out.println(formatterAdapter.formatText(testString));
    }
}
