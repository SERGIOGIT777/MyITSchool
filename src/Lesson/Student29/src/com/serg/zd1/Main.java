package Lesson.Student29.src.com.serg.zd1;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
      /*  Locale current = Locale.getDefault();
        System.out.println(current);*/
        
        Locale fr = Locale.FRANCE;
        Locale us = Locale.US;
        Locale uk = new Locale("uk", "UK");

        Locale.setDefault(Locale.CANADA);
        Locale current = Locale.getDefault();
        getLocaleInfo(fr);
        getLocaleInfo(us);
        getLocaleInfo(uk);
    }

    private static void getLocaleInfo(Locale curent){
        System.out.println("Код региона " + curent.getCountry());
        System.out.println("Название региона " + curent.getDisplayCountry());
        System.out.println("Код языка региона " + curent.getLanguage());
        System.out.println("Название языка региона " + curent.getDisplayLanguage());
        System.out.println();

    }
}
