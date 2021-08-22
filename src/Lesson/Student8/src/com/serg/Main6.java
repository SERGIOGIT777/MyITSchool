package Lesson.Student8.src.com.serg;

import java.util.Scanner;

public class Main6 {

    //---------------Выводит минимальное число

  /*  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число");
        int a = sc.nextInt();
        System.out.print("\nРезультат = " + logic(a));
    }

    static boolean logic(int a) {
        if (a < 5) return true;
        else return false;
    }

   */

    //----------------Выводит четное число

  /*public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Введите число");
      int a = sc.nextInt();
      System.out.print("\nРезультат = " + chet(a));
  }

  static String chet(int a) {
      if (a % 2 == 0) {
          return "Четное";
      } else return "Не четное";
  }

   */

    //-------------------Выводит большое число----------

        /*public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число - ");
            int a = sc.nextInt();
            System.out.print("\nВведите число - ");
            int b = sc.nextInt();
            System.out.print("\nРезультат = " + bols(a,b));
        }

        static String bols(int a, int b) {
            if (a>b) return "Число " + a + " больше " + b;
            else return "Число " + b + " больше " + a;
        }

         */

    //-----------------Выводит минимальное число-----------------

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите число - ");
            int a = sc.nextInt();
            System.out.print("\nВведите число - ");
            int b = sc.nextInt();
            System.out.print("\nРезультат = " + min(a,b));
    }

    static String min(int a, int b) {
        if (a>b) return "Число " + b + " минимальное";
        else return "Число " + a + " минимальное";
    }

}
