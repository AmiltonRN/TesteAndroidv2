package br.com.amilton.util;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class CurrencyUtils {
    public static String format(double currency) {
        final DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getNumberInstance();
        decimalFormat.applyPattern(String.format("%1$s #,##,##0.00;-%1$s #,##,##0.00", NumberFormat.getCurrencyInstance().getCurrency().getSymbol()));
        return decimalFormat.format(currency);
    }
}
