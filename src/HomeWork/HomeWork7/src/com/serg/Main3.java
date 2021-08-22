package HomeWork.HomeWork7.src.com.serg;

import java.util.Arrays;
import java.util.Random;

public class Main3 {
    public static void main(String[] args) {
        int[] mass = new int[15];
        int a = 0;
        int b = 0;
        int c = 0;
        double sr;
        int d;
        int e = 0;
        int e1 = 0;
        int f = 0;
        int f1 = 0;
        int g1 = 0;
        Random rnd = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt(20);
        }
        System.out.println(Arrays.toString(mass));
        for (int i = 0; i < mass.length; i++) {
            if (mass[a] < mass[i]) a = i;
            if (mass[b] > mass[i]) b = i;
            c = mass[i] + c;
        }
        for (int value : mass) {
            for (int j = 2; j < value; j++) {
                if (value % j == 0) {
                    e = j + e;
                }
            }
            if (e == 0 && value != 1 && value != 0) {
                e1 = value;
                break;
            } else e = 0;
        }
        for (int value : mass) {
            for (int j = 2; j < value; j++) {
                if (value % j == 0) {
                    f = j + f;
                }
            }
            if (f == 0 && value != 1 && value != 0) {
                f1 = value;
                ++g1;
            } else f = 0;
        }
        sr = (double) c/mass.length;
        d = b-a;
        System.out.print("Максимальный элемент = " + mass[a]);
        System.out.print("\nМинимальный элемент = " + mass[b]);
        System.out.print("\nСреднее арифмитическое = " + sr);
        System.out.print("\nКоличество элементов между максимальным и минимальным элементом = " + (Math.abs(d)-1));
        System.out.print("\nПервый простой элемент = " + e1);
        System.out.print("\nПоследний простой элемент = " + f1);
        System.out.print("\nКоличество простых элементов = " + g1);
    }
}
