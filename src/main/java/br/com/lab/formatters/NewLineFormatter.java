package br.com.lab.formatters;

public class NewLineFormatter implements TextFormattable {
    @Override
    public String formatText(String text) {
        var formattedText=text.replace(".","\n");
        return formattedText;
    }
}
