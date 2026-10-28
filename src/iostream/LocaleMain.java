package iostream;

import java.text.NumberFormat;
import java.util.Locale;

public class LocaleMain {
    public static void main(String[] args){
        double number = 1234.56;

        NumberFormat usFormat = NumberFormat.getNumberInstance(Locale.US);

        NumberFormat franceFormat = NumberFormat.getNumberInstance(Locale.FRANCE);

        NumberFormat germanyFormat = NumberFormat.getNumberInstance(Locale.GERMANY);

        System.out.println("US: " + usFormat.format(number));
        System.out.println("France: " + franceFormat.format(number));
        System.out.println("germanyFormat: " + germanyFormat.format(number));
    }
}
