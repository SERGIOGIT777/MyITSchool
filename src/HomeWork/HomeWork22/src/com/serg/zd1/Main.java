package HomeWork.HomeWork22.src.com.serg.zd1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println("Выберите метод поиска:" +
                "\n1. Основной пример;" +
                "\n2. Пример поиска cab;" +
                "\n3. Пример поиска ccab;" +
                "\n4. Пример поиска cccab;" +
                "\n5. Выход.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        switch (a){
            case 1: pr1(); break;
            case 2: pr2(); break;
            case 3: pr3(); break;
            case 4: pr4(); break;
            case 5: break;
        }

    }

    public static void pr1(){
        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaab");
        boolean b = matcher.matches();
        System.out.println(b);
    }

    public static void pr2(){
        Pattern pattern = Pattern.compile("c*a*b");
        Matcher matcher = pattern.matcher("cab");
        boolean b = matcher.matches();
        System.out.println(b);
    }

    public static void pr3(){
        Pattern pattern = Pattern.compile("c*a*b");
        Matcher matcher = pattern.matcher("ccab");
        boolean b = matcher.matches();
        System.out.println(b);
    }

    public static void pr4(){
        Pattern pattern = Pattern.compile("c*a*b");
        Matcher matcher = pattern.matcher("cccab");
        boolean b = matcher.matches();
        System.out.println(b);
    }
}
