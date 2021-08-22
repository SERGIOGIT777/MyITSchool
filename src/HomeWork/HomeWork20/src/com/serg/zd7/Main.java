package HomeWork.HomeWork20.src.com.serg.zd7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var sc = new Scanner(System.in).nextLine();
        String s1;
        if ("abc".startsWith(sc)) {
            s1 = sc.replace("abc", "www");
        }else{
            s1 = sc.concat("zzz");
        }
        System.out.println(s1);
    }
}
