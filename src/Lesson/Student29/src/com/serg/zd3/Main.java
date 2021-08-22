package Lesson.Student29.src.com.serg.zd3;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Main {

    public static void main(String[] args)throws ParseException {
      /*  double number = 123.4567;
        Locale locFR = new Locale("fr");

        NumberFormat numberFormat1 = NumberFormat.getInstance();
        System.out.println("Число в текущей локали: " + numberFormat1.format(number));

        NumberFormat numberFormat2 = NumberFormat.getInstance(locFR);
        System.out.println("Число во французской локали: " + numberFormat2.format(number));

        NumberFormat numberFormat3 = NumberFormat.getCurrencyInstance();
        System.out.println("Денежная единица в текущей локали: " + numberFormat3.format(number));

        NumberFormat numberFormat4 = NumberFormat.getCurrencyInstance(locFR);
        System.out.println("Денежная единица во французской локали: " + numberFormat4.format(number));

        NumberFormat numberFormat5 = NumberFormat.getPercentInstance();
        System.out.println("Процент в текущей локали: " + numberFormat5.format(number));

        NumberFormat numberFormat6 = NumberFormat.getPercentInstance(locFR);
        System.out.println("Процент во французской локали: " + numberFormat6.format(number));

       */

        /*double d = 123.45678;
        NumberFormat nf = NumberFormat.getInstance();

        System.out.print("Максимальное количество знаков в дробной части "
                + nf.getMaximumFractionDigits() + ": ");
        System.out.println(nf.format(d));

        nf.setMaximumFractionDigits(7);
        System.out.print("Максимальное количество знаков в дробной части 7: ");
        System.out.println(nf.format(d));

        nf.setMaximumIntegerDigits(2);
        System.out.print("Максимальное количество знаков в целой части 2: ");
        System.out.println(nf.format(d));

         */

        NumberFormat nf = NumberFormat.getInstance();
        System.out.println(nf.parse("1234,567"));
        nf.setParseIntegerOnly(true);
        System.out.println(nf.parse("1234,567"));
    }
}
