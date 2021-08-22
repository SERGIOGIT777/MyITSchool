package Lesson.Student23.src.com.serg.zd1;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        /*Pattern pattern = Pattern.compile("qwerty");
        System.out.println(pattern.pattern());*/

       /* System.out.println(Pattern.matches("А.+а", "Алла"));
        System.out.println(Pattern.matches("А.+а","Егор Алла Александр"));*/

       /* Pattern pattern = Pattern.compile("abc");
        System.out.println(pattern.flags());

        Pattern pattern1 = Pattern.compile("abc",Pattern.MULTILINE);
        System.out.println(pattern1.flags());*/

        String text = "Егор Алла Александр";
        Pattern pattern = Pattern.compile("\\s");

        String[] strings = pattern.split(text, 2);
        for(String s: strings) {
            System.out.println(s);
        }

        System.out.println("-------------------------------");

        String [] strings1 = pattern.split(text);
        for (String s: strings1) {
            System.out.println(s);
        }


    }
}
