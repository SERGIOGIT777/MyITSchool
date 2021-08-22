package HomeWork.HomeWork10.src.com.serg3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число а = ");
        int a = sc.nextInt();
        System.out.print("\nВведите число b = ");
        int b = sc.nextInt();
        if (a > b) System.out.print("Если а > b функция равна = " + masic(a,b));
        else System.out.print("\nЕсли а < b функция равна = " + masic(a,b));
    }

private static String masic(int a, int b) {

    if (a > b) {
        return a + " " + masic(a-1,b);
    } else {
        if (a == b) return Integer.toString(a);
        return a + " " + masic(a+1,b);
    }
}
}
