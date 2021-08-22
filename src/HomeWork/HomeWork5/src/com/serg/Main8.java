package HomeWork.HomeWork5.src.com.serg;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        var mass = new int [3];
        int b = (int)(Math.random()*100);
        int min1 = 1;
        int max1 = 1;
        for (int i = 0; i < mass.length; i++) {
            System.out.print("\nВведите число от 1 до 100\nВаше число = ");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
                if (a < b) {
                    if (max1==2) min1=2;
                    min1 = mass.length - min1;
                    if (min1 == 1){
                    System.out.print("Ваше число меньше загаданного\n");
                    System.out.print("У вас осталось " + min1 + " попыток");
                    min1 = 3;
                    } else {
                        System.out.print("Ваше число меньше загаданного\n");
                        System.out.print("У вас осталось " + min1 + " попыток");
                    }
                    if (min1 == 3) max1 = 3;
                }
                else if (a > b) {
                    if (min1==2) max1 =2;
                    max1 = mass.length - max1;
                    if (max1 == 1){
                        System.out.print("Ваше число больше загаданного\n");
                        System.out.print("У вас осталось " + max1 + " попыток");
                        max1 = 3;
                    } else {
                        System.out.print("Ваше число больше загаданного\n");
                        System.out.print("У вас осталось " + max1 + " попыток");
                    }
                    if (max1==3) min1 = 3;
                }
             else {
                System.out.print("Вы отгадали число");
                break;
            }
        }
        System.out.print("\nЗагаданое число = " + b);
    }
}
