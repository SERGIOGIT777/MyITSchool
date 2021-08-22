package HomeWork.HomeWork23.src.com.serg.zd4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static String S;
    private static boolean bool;


    private static final String str = "^[(]?[(]?\\w+[)]?\\w+[)]?$";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите строку со скобками = ");
        S=s.next();
        System.out.println();
        bool= validate(S);
        if(bool) {
            System.out.println("Строка является корректной");
        }
        else {
            System.out.println("Строка не является корректной");
        }
    }

    public static boolean validate( String strok){
        Pattern pattern = Pattern.compile(str);
        Matcher matcher = pattern.matcher(strok);
        return matcher.matches();
    }
}
