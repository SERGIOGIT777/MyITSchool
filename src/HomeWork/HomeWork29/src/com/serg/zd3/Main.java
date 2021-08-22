package HomeWork.HomeWork29.src.com.serg.zd3;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        printinfo( "ru", "RU");
        printinfo( "us", "US");
    }

    private static void printinfo (String language, String country)  {
        Locale curent = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("com.serg.zd3.Theme", curent);

        for(String key: rb.keySet()){
            String value = rb.getString(key);
            System.out.println(value);
        }
        System.out.println();
    }

}
