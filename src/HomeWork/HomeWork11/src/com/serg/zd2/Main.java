package HomeWork.HomeWork11.src.com.serg.zd2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arifmetic ar = new Arifmetic(2, 3);
        System.out.println("Число a = " + ar.getA() + " число b = " + ar.getB());
        ar.max();
        ar.sum();
        System.out.print("Введите число a = ");
        int a = sc.nextInt();
        System.out.print("\nВведите число b = ");
        int b = sc.nextInt();
        ar.setA(a);
        ar.setB(b);
        System.out.println("Число a = " + ar.getA() + " число b = " + ar.getB());
        ar.max();
        ar.sum();
    }
}
