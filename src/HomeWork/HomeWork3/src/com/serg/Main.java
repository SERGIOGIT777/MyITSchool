package HomeWork.HomeWork3.src.com.serg;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //-------------------Задача 1---------------------

        System.out.println("Задача 1");

        System.out.println("Загадка\nЧто это такое: синий, большой, с усами и полностью набит зайцами?\nПомните что на ответ вам дается 3 попытки");
        Scanner sc = new Scanner(System.in);
        for (int i1 = 1; i1 <=3 ; i1++) {
            System.out.print("Ваш ответ: ");
            String otvet = sc.next();
            switch (otvet) {
                case ("Тролейбус"):
                    System.out.println("Вы угадали! Ответ " + otvet + " правильный");
                    break;
                case ("Сдаюсь"):
                    System.out.println("Правильный ответ - Тролейбус");
                    break;
                default:
                    int p = 3 - i1;
                    System.out.print("У вас осталось - " + p + " попыток \n");
                    if (i1 == 3) System.out.println("Правильный ответ - Тролейбус");
                    continue;
            }
            break;
        }



        //-------------------Задача 2---------------------

        System.out.println("----------------------------------------");
        System.out.println("Задача 2");

        for (int i2 = 1; i2 <= 10; i2++) {
            for (int j2 = 10; j2 >= 1; j2--) {
                switch (j2 = 5) {
                    case 10:
                    case 9:
                    case 8:
                    case 7:
                    case 6:
                    case 5:
                        System.out.println("Вы перебирали с 10 печеньки");
                        System.out.println("Вы нашли счастливую печеньку № " + j2);
                        break;
                }
                break;
            }
            switch (i2 = 5) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.println("Вы перебирали с 1 печеньки");
                    System.out.println("Вы нашли счастливую печеньку № " + i2);
                    break;
            }
            break;
        }

        //-------------------Задача 3---------------------

        System.out.println("----------------------------------------");
        System.out.println("Задача 3");
        for (int i3 = 25; i3 < 36; i3++) {
            double a = 0.5;
            double b = 0.2;
            double a1 = i3 + a;
            double b1 = i3 - b;
            System.out.println(i3 + " " + a1 + " " + b1);
        }

        //-------------------Задача 4---------------------

        System.out.println("----------------------------------------");
        System.out.println("Задача 4");
        for (int i4 = 998; i4 <= 1023; i4++) {
            int j4 = i4 + 3;
            System.out.print(j4 + " ");
            i4 = --j4;
        }


        //-------------------Задача 5---------------------

        System.out.println("----------------------------------------");
        System.out.println("Задача 5");
        Scanner zd5 = new Scanner(System.in);
        System.out.print("Посчитать курс доллара в рублях:\nВведите рубли = ");
        double kurs = zd5.nextDouble();
        for (int i5 = 1; i5 <= 100; i5++) {
            double rubl = kurs*i5;
            double konfeti = rubl/20;
            System.out.println(i5 + " $ - " + rubl + " р - " + konfeti + " кг");

        }





        //-------------------Задача 6---------------------

        System.out.println("----------------------------------------");
        System.out.println("Задача 6");
        for (double i6 = 1; i6 <= 2.6; i6 = i6 + 0.2) {
            double j6 = i6 + 0.2;
            String result = String.format("%.1f",j6);
            System.out.print(result + " ");
        }


    }
}
