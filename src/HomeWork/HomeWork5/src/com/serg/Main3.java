package HomeWork.HomeWork5.src.com.serg;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int[] mass = new int[15];
        var sc = new Scanner(System.in);
        System.out.print("Введите число от 0 до 3 = ");
        int a = sc.nextInt();
        System.out.print("\nСгенерированный массив (размер 15 цифр) без введенного  = ");
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int)(Math.random()*4);
            if (mass[i] != a)
            System.out.print(mass[i] + " ");
            }
        }
}
