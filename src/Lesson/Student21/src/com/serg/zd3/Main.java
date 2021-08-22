package Lesson.Student21.src.com.serg.zd3;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	    /*String str = String.format("Hi - %s! How are you %s?", "Tom", "today");
	    System.out.println(str);*/

        /*System.out.printf("Hi - %s! How are you %s", "Stive", "today");
        System.out.println();
        System.out.format("Hi - %s! How are you %s?", "Jonh", "today");

         */

        /*String dtr = String.format("Расстояние от Питера до Лондона - %.3f. Не так уж и много", 900.567);
        System.out.println(dtr);
        String dtr = String.format("%1$+09.5f", 3.14764324224);
        System.out.println(dtr);*/

        /*DecimalFormat df = new DecimalFormat("#.###");
        double val = 32.34343222;
        System.out.println(df.format(val));

        System.out.println(new DecimalFormat("###,###.##").format(2313123312.3123132131));
        System.out.println(new DecimalFormat("%###.##").format(0.3924342424));*/

        /*DecimalFormat df = new DecimalFormat("##.###");
        String result = df.format(86.4357);
        System.out.println(result);*/

      /*  String first = String.format("%.4f", 9.00000000128);
        System.out.println(first);

        DecimalFormat df = new DecimalFormat("#.####");
        String second = df.format(9.00000000128);
        System.out.println(second);*/

       /* BigInteger value = new BigInteger("4321");

        int intValue = value.intValue();
        long longvalue = value.longValue();
        double doublevalue = value.doubleValue();*/

       /* BigInteger first = new BigInteger("36546");
        BigInteger second = new BigInteger("35672");

        BigInteger result1 = first.add(second); // сложение

        BigInteger result2 = first.multiply(second); // умножение

        BigInteger result3 = first.remainder(second); // нахождение остатка

        BigInteger third = new BigInteger("-12423");

        BigInteger result4 = third.abs();  */

 /*       BigDecimal value = new BigDecimal(2343222.2);
        long longvalue = value.longValue();
        double doublevalue = value.doubleValue(); */

        /*BigDecimal firstvalue = new BigDecimal("27382183.545");
        BigDecimal secondvalue = new BigDecimal(3455.54);

        System.out.println(firstvalue);
        System.out.println(secondvalue); */

        BigDecimal thirddecinmal = new BigDecimal("4232.343225353443", MathContext.DECIMAL32);
        System.out.println(thirddecinmal);

        char[]arr = "328492843.34242423".toCharArray();
        BigDecimal fourthValue = new BigDecimal(arr, 2, 6);

        BigDecimal fifthValue = new BigDecimal(new BigInteger("32323"),3);

        System.out.println(fourthValue);
        System.out.println(fifthValue);


    }
   /* public static String format(String format, Object...args){

    }*/
}
