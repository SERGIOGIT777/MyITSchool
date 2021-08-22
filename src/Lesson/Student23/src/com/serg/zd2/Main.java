package Lesson.Student23.src.com.serg.zd2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        /*Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaaaab");*/

        String text = "Егор Алла Анна";
        Pattern pattern = Pattern.compile("А.+?а");

        Matcher matcher = pattern.matcher(text);

        while (matcher.find()){
            int start = matcher.start();
            int end = matcher.end();
            System.out.println("Найдено совпадений " + text.substring(start, end) + " с " +
                    start + " до " + (end-1) + " позиции");
        }

        System.out.println(matcher.replaceFirst("Ира"));
        System.out.println(matcher.replaceAll("Жана"));
        System.out.println(text);

    }
}
