package HomeWork.HomeWork8.src.com.serg;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        System.out.print(sum());
    }

    static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число = ");
        int a = sc.nextInt();
        int sum = 0;
        if (a>9) {
            while (a != 0) {
                sum = sum + (a % 10);
                a = a / 10;
            }
        }
        System.out.print("\nСумма цифр числа = ");
        return sum;
    }
}

