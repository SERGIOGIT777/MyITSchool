package HomeWork.HomeWork4.src.com.serg;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //------------Задача 1----------------

        /*Scanner chisl = new Scanner(System.in);
        System.out.print("Введите 4-значное число = ");
        int a = chisl.nextInt();
        System.out.println("-------------- ");
        int b = Math.round(a / 1000);
        int c = Math.round((a % 1000) / 100);
        int d = Math.round((a % 100) / 10);
        int e = Math.round(a % 10);
        System.out.print("Исходное 4-значное число = ");
        if (b<5) System.out.print(b);
        if (c<5) System.out.print(c);
        if (d<5) System.out.print(d);
        if (e<5) System.out.print(e);
        if (b>=5) System.out.print(b);
        if (c>=5) System.out.print(c);
        if (d>=5) System.out.print(d);
        if (e>=5) System.out.print(e);
        */

        //------------Задача 2----------------

        /*Scanner chisl = new Scanner(System.in);
        System.out.print("Введите 4-значное число = ");
        int a = chisl.nextInt();
        System.out.println("-------------- ");
        int b = Math.round(a / 1000);
        int c = Math.round((a % 1000) / 100);
        int d = Math.round((a % 100) / 10);
        int e = Math.round(a % 10);
        System.out.println("Исходное 4-значное число");
        if ((b == e) && (c == d)) System.out.print("YES");
        else System.out.print("NO");
         */

        //------------Задача 3----------------

        /*Scanner chisl = new Scanner(System.in);
        System.out.print("Введите число а в пределах от 1 до 180 = ");
        int a = chisl.nextInt();
        int n = 0;
        System.out.println("-------------- ");
        n = 10 + (a-1)/2;
        if (a % 2 == 0) n = n % 10;
        else n = n / 10;
        System.out.print("а-я цифра в последовательности от 10 до 99 = " + n);
         */


        //------------Задача 4----------------

       /* Scanner chisl = new Scanner(System.in);
        System.out.print("Число дней тренировки лыжника = ");
        int n = chisl.nextInt();
        int a = 10;
        int a1 = 10;
        int b = 10;
        int c = 10;
        int d = 10;
        int d1 = 10;
        int d2 = 0;
        System.out.println("a) -------------- ");
        for (int i = 2; i <= n; i++) {
           a = (int) ((a*0.1)+a);
           c = c + a;
           System.out.println("Пробег лыжника за " + i + " день тренировки равен = " + a + " км.");
        }
        System.out.println("б) -------------- ");
        for (int j = 2; j <= 7; j++) {
            a1 = (int) ((a1*0.1)+a1);
            b = b + a1;
        }
        System.out.println("Пробег лыжника за 7 дней = " + b + " км.");
        System.out.println("в) -------------- ");
        System.out.println("Пробег лыжника за n дней = " + c + " км.");
        System.out.println("г) -------------- ");
        for (int k = 2; k <= n; k++) {
            d = (int) ((d*0.1)+d);
            d1 = d1 + d;
            if (d1>80) break;
            d2 = k;
        }
        System.out.println("Лыжнику стоит остановиться на " + d2 + " дне тренировки");
        */

        //------------Задача 5----------------
        /*for (int i = 1000; i<=9999; i++) {
            int b = Math.round(i / 1000);
            int c = Math.round((i % 1000) / 100);
            int d = Math.round((i % 100) / 10);
            int e = Math.round(i % 10);
            if (((b!=5) && (b!=6)) && ((c!=5) && (c!=6)) && ((d!=5) && (d!=6)) && ((e!=5) && (e!=6)))
                System.out.println("Число = " + b + c + d + e);
         */

        //------------Задача 6----------------
       /* for (int i = 1000; i<=9999; i++) {
            int b = Math.round(i / 1000);
            int c = Math.round((i % 1000) / 100);
            int d = Math.round((i % 100) / 10);
            int e = Math.round(i % 10);
            if (((b!=c) && (b!=d) && (b!=e)) && ((c!=b) && (c!=d) && (c!=e)) &&
                    ((d!=b) && (d!=c) && (d!=e)) && ((e!=b) && (e!=c) && (e!=d)))
                System.out.println("Число = " + b + c + d + e);
        }
        */

        //------------Задача 7----------------

        /* int f1 = 0;
            while (f1 <= 10) {
                int f = (int) (Math.random() * 2);
                f1 = f1 + f;
                System.out.print(f + " ");
            }
         */

        //------------Задача 8----------------

        /*int dvoj = 0;
        int tooj = 0;
        int sumtr = 0;
        int sumdv = 0;
        int f = 0;
        int dvktr = 0;
        int trkdv = 0;
        for (int i = 1; i <= 10; i++) {
            f = (int) (Math.random() * 3) + 1;
            System.out.print(f + " ");
            if (f == 2) dvoj++;
            if (f == 3) tooj++;
            if ((f == 3) && (i % 2==0)) sumtr++;
            if ((f == 2) && (i <= 5)) sumdv++;
        }
        System.out.println(" ");
        System.out.println("Количество двоех = " + dvoj +"\nКоличество троех = " + tooj);
        dvktr = dvoj - tooj;
        trkdv = tooj - dvoj;
        if (dvoj >= tooj) System.out.print("Количество двоех больше троех на " + dvktr + "\n");
        if (dvoj <= tooj) System.out.print("Количество двоех меньше троек на " + trkdv + "\n");
        if (dvoj == tooj) System.out.print("Равное количество двоек и троек \n");
        System.out.print("Количество троек на четных местах = " + sumtr + "\n");
        System.out.print("Количество двоек среди первых 5 чисел последовательности = " + sumdv);
         */

        //------------Задача 9----------------

        /*int f = 0;
        int kol = 0;
        int sum = 12;
        int dv = 0;
        int ed = 0;
        for (int i = 1; i <= 20; i++) {
                for (int j = 1; j <= sum; j++) {
                    f = (int) (Math.random() * 3);
                    if (f == 1) ed++;
                    if (f == 2) dv++;
                    sum = 12 - f;
                    System.out.print(f + " ");
                    kol=j;
                }
            System.out.println();
            System.out.println("Длина " + i + " серии = " + kol);
            float srd = (float) ((kol-dv+ed)/kol);
            System.out.println("Средняя длина " + i + " серии = " + srd);
            sum = 12;
            System.out.println("Количество двоек в " + i + " серии = " + dv);
            float sr = (float) dv/kol;
            System.out.println("Среднее количество двоек в " + i + " серии = " + sr);
            dv = 0;
            System.out.println("Количество единиц в " + i + " серии = " + ed);
            ed = 0;
        }

         */

        //------------Задача 9----------------

        System.out.println("Введите число");
        Scanner sc = new Scanner(System.in);
        long ch = sc.nextLong();
        int q = 0 ;
        String chStr = String.valueOf(ch);
        for (int i = 0; i < chStr.length(); i++) {
            if (((ch % 10) > 3)&& ((ch % 10) < 8)){
                q++;
            }
            ch = ch / 10;
        }
        System.out.println(q);

    }
}
