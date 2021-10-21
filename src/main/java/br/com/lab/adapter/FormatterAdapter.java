package br.com.lab.adapter;

import br.com.lab.formatters.CsvFormattable;
import br.com.lab.formatters.TextFormattable;

public class FormatterAdapter implements TextFormattable {
    private CsvFormattable csvFormatter;

    public FormatterAdapter(CsvFormattable csvFormatter) {
        this.csvFormatter = csvFormatter;
    }

    @Override
    public String formatText(String text) {
        return this.csvFormatter.formatCsvText(text);
    }
}
