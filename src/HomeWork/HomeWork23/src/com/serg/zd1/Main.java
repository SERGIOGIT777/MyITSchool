package HomeWork.HomeWork23.src.com.serg.zd1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static String S;
    private static boolean bool;


    private static final String IP = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                     "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                     "([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
                                     "([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите IP = ");
        S=s.next();
        System.out.println();
        bool= validate(S);
        if(bool) {
            System.out.println("Строка является IP адресом");
        }
        else {
            System.out.println("Строка не является IP адресом");
        }
    }

    public static boolean validate( String ip){
        Pattern pattern = Pattern.compile(IP);
        Matcher matcher = pattern.matcher(ip);
        return matcher.matches();
    }
}
