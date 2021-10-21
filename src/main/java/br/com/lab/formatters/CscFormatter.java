package br.com.lab.formatters;

public class CscFormatter implements CsvFormattable {
    @Override
    public String formatCsvText(String text) {
        var formattedText=text.replace(".",",");
        return formattedText;
    }
}
