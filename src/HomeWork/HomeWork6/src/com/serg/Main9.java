package HomeWork.HomeWork6.src.com.serg;

import java.util.Arrays;
import java.util.Random;

public class Main9 {
    public static void main(String[] args) {
        int[] mass = new int[15];
        int a = 0;
        int b = 0;
        Random rnd = new Random();
        for (int i = 0; i < mass.length; i++) {
            mass[i] = rnd.nextInt(20);
        }
        System.out.println(Arrays.toString(mass));
        for (int value : mass) {
            if (value % mass[1] == 0) ++a;
            if (value % mass[mass.length - 1] == 0) ++b;
        }
        if(a>b) System.out.print("Больше чисел, которые деляться на первый элемент массива");
        else System.out.print("Больше чисел, которые деляться на последний элемент массива");
    }
}

