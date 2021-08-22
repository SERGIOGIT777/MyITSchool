package Lesson.Student2.src.com.serg;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*        int i = 100;
        while (i >= 10) {
            System.out.println("Обратный отсчет: " + i);
            i-=10;
        }
 */

   /*     int i = 1;
        do {
            i++;
            System.out.println(i + " ");
        }
        while (i < 0);
    */
        /*
        for (int i = 1; i<=5; i++) {
            System.out.println("JAVA");
        }
         */
   /*     for (int i = 3; i >= -3; i--) {
            System.out.println(i);
        }

    */
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("i = ");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);

         */
       /* int i = 7;
        while (i<=98) {
            System.out.print(i + " ");
            i+=7;
        }


        int j = 1;
        while (j<=512) {
            System.out.print(j + " ");
            j = 2*j;
            if (j == 32) {
                j = j + 96;
            }
        }

        int i = 1;
        int a = 3;
        while (i <= 5) {
            System.out.println(i+ ": Выполненение цикла! ");
            if (i == a)
                break;
                i++;
        }
        for (int i = 1; i <= 3; i++) {
            System.out.println("Первый цикл!!!! выполнение " + i + " раз");
            for (int a = 1; a <= 10; a++) {
                System.out.println("    Второй цикл!!!! выполнение " + a + " раз");
                if (a==2)
                    break;
            }
        }

        for (int i = 1; i <= 7; i++) {
            System.out.println(i + ": выполнение перед continue");
            if (i > 2)
                continue;
            System.out.println("      " + i + " : выполнение всего 2 раза");
        }

        */



        /*Scanner scan = new Scanner(System.in);
        System.out.print("Введите число = " );
        int b = scan.nextInt();
        System.out.println("Таблица умножения ");
        for (int i = 1; i <=10; i++) {
            int n = b * i;
            System.out.print(n + " ");
        }

         */

        /* System.out.print("Последовательность чисел Фибонначи \nРяд равен = ");
        int a = 1;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= 10; i++) {
            int sum = a + b;
            System.out.print(sum + " ");
            a = b;
            b = sum;
        }

         */
        /*System.out.println("Квадрат из *");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print(" * ");
            }
            System.out.println(" * ");
        }
         */
        System.out.println("Загадка\nБежит, дрожит, трясётся По улицам несётся. Удивительный Олень - Громыхает целый день.\nПомните что на ответ вам дается 3 попытки");
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <=3 ; i++) {
            System.out.print("Ваш ответ: ");
            String otvet = sc.next();
            switch (otvet) {
                case ("Тролейбус"):
                    System.out.print("Вы угадали! Ответ " + otvet + " правильный");
                    break;
                case ("Сдаюсь"):
                    System.out.print("Правильный ответ - Тролейбус");
                    break;
                default:
                    int p = 3 - i;
                    System.out.print("У вас осталось - " + p + " попыток \n");
                    if (i == 3) System.out.print("Правильный ответ - Тролейбус");
                    continue;
            }
           break;
        }
    }
}
