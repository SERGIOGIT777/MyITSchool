package HomeWork.HomeWork20.src.com.serg.zd6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var s = new Scanner(System.in).nextLine();
        var s1 = new Scanner(System.in).nextLine();
        int a = s.length();
        int b = s1.length();
        if (a<b) {
            int k = b-a;
            for(int i = 0; i < k; i++){
                System.out.println(s1);
            }
        } else {
            int k1 = a-b;
            for (int i = 0; i < k1; i++){
                System.out.println(s);
            }
        }
    }
}
