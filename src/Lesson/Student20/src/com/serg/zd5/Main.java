package Lesson.Student20.src.com.serg.zd5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str = "I like Java!!!";
        System.out.println(str.substring(str.length() - 1));
        System.out.println(true);
        System.out.println(true);
        System.out.println(true);
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(7, 11));

        String str1 = "Airport";
        System.out.println(str1.substring(str1.length() - 1));
        System.out.println(str1.substring(0, 1));
        System.out.println(str1.charAt(str1.length()/ 2));

        String str2 = new Scanner(System.in).nextLine();

        if (str2.length() > 5) {
            System.out.println(str2.substring(0, 3));
            System.out.println(str2.substring(str2.length()-3));
        }else {
            for(int i = 0; i < str2.length(); i++) {
                System.out.println(str2.substring(0, 1));
            }
        }
    }
}
