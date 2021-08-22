package Lesson.Student20.src.com.serg.zd1;

import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args)  {

        String str1 = "";
        System.out.println("str1: [" + str1 + "]");

        char[] char1 = {'h', 'e', 'l', 'l', 'o'};
        String str2 = new String(char1);
        System.out.println("str2: [" + str2 + "]");

        char[] char2 = {'w', 'e', 'l', 'c', 'o', 'm', 'e'};
        String str3 = new String(char2, 2, 3);//от какого символа и сколько символов выводить
        System.out.println("str3: [" + str3 + "]");

        String str4 = "abc";
        System.out.println("Str4 length: " + str4.length());

        System.out.println("abc.length: " + "abc".length());

        System.out.println("Str5: " + str4);

        byte[] bytes = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        String str6 = new String(bytes, StandardCharsets.UTF_8);

        System.out.println("Str6: " + str6);

        String str7 = new String(bytes, 2, 3);
        System.out.println(str7);
    }
}
