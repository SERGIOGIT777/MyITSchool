package HomeWork.HomeWork5.src.com.serg;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.print("Введите число n = ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("\n");
        var mass = new int[n];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = 1;
            System.out.print(mass[i] + " ");
        }
        System.out.print("\n");
        var mass1 = new int[n * 2];
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = 2;
            System.out.print(mass1[i] + " ");
        }
        System.out.print("\n");
        var mass2 = new int[n * 3];
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = 3;
            System.out.print(mass2[i] + " ");
        }
    }
}
