package HomeWork.HomeWork6.src.com.serg;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        int [] mass = new int[12];
        for (int i = 0; i < mass.length/2; i++) {
            mass[i] =-5 + (int) (Math.random() * 11);
            if (mass[i]==0){
                i--;
            }
            mass[mass.length - (i+1)] = -mass[i];
        }
        for (int value : mass) {
            System.out.print(value + " ");
        }
    }
}
