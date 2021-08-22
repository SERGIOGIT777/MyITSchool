package Lesson.Student22.src.com.serg.zd2;

import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
       // Date date = new Date();
        //System.out.printf(Locale.ENGLISH, "%tB %te, %tY", date, date, date);

       // System.out.printf("%td %tB %tY года %n%tH:%tM:%tS", date, date,
      //         date, date, date, date);

      //  System.out.printf("%1$td %1$tB %1$tY года %n%1$tH:%1$tM:%1$tS", date);

     //   Pattern pat = Pattern.compile("java", Pattern.CASE_INSENSITIVE);

       /* String text = "Sergio Math Paty";
        Pattern pattern = Pattern.compile("S.+g");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }

        */
        /*String text = "Sergio Math Paty";
        Pattern pattern = Pattern.compile("M.++y");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }*/

        /*String text = "Sergio Math Paty";
        Pattern pattern = Pattern.compile("S.+?t");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }

         */

        /*String str = "Hello World in \nqwerty";

        String str1 = "Hello orld in \00A7qwerty";

        String regex = "\\s";

        //String regex="\\"Windows\\"";

        String regex3 = "How\\?";



        Pattern pattern = Pattern.compile("abc");
        System.out.println(pattern.pattern());

        System.out.println(Pattern.matches("С.+й", "Сергей"));
        System.out.println(Pattern.matches("С.+й", "Серг"));

        Pattern pattern = Pattern.compile("abc");
        System.out.println(pattern.flags());

        Pattern pattern1 = Pattern.compile("abc",Pattern.CASE_INSENSITIVE);
        System.out.println(pattern1.flags());

         */
        String text = "Егор Алла Анна";
        Pattern pattern = Pattern.compile("\\s");
        String[] strings = pattern.split(text,2);
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println("---------");
        String[] strings1 = pattern.split(text);
        for (String s : strings1) {
            System.out.println(s);
        }

    }
}
