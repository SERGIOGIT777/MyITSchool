package HomeWork.HomeWork6.src.com.serg;

import javax.swing.*;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner mas = new Scanner(System.in);
        System.out.print("Введите размерность массива = ");
        int a;
        do {
            a = mas.nextInt();
            if (a % 2 != 0) {
                System.out.println();
                System.out.println("Размер массива не четный!!!");
                System.out.print("Введите размерность массива = ");
            }
        }while(a % 2 != 0);
        int [] mass = new int[a];
        for (int i = 0; i < mass.length/2; i++) {
            mass[i] = (int) (Math.random() * 9);
            mass[mass.length - (i+1)] = mass[i];
        }
        for (int value : mass) {
            System.out.print(value + " ");
        }

    }
}
