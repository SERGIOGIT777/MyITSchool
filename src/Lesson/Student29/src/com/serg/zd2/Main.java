package Lesson.Student29.src.com.serg.zd2;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        printInfo("", "");
        printInfo("en", "US");
        printInfo("uk", "UA");
    }

    private static void printInfo(String language, String country) {
        Locale curent = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", curent);

        String s1 = rb.getString("str1");

        System.out.println(s1);
        String s2 = rb.getString("str2");
        System.out.println(s2);
        System.out.println();
    }
    
    private static void printinfo2(String language, String country) {
        Locale curent = new Locale(language, country);
        ResourceBundle rb = ResourceBundle.getBundle("text", curent);

        for(String key: rb.keySet()){
            String value = rb.getString(key);
            System.out.println(value);
        }
        System.out.println();
    }
}
