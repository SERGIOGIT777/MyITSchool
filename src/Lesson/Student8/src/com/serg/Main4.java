package Lesson.Student8.src.com.serg;

import java.util.Scanner;

public class Main4 {
    /*public static void main(String[] args) {
        sum("Word", 10, 20, 30);
        sum("Hello");
    }
    static void sum(String message, int ...nums){
        System.out.println(message);
        int result = 0;
        for(int n:nums){
            result +=n;
        }
        System.out.println(result);
    }

     */

    //------------------оператор return----------------

  /*  public static void main(String[] args) {
        int x = sum(1,2,3);
        int y = sum(4,5,6);
        System.out.println(x);
        System.out.println(y);
    }

    static int sum(int a, int b, int c) {
        return a+b+c;
    }

   */


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите время суток: ");
            int hour = sc.nextInt();
            System.out.print("\n" + daytime(hour));
         }

         static String daytime(int hour) {
            if (hour > 24 || hour <0) {
                return "Invalid date";
            }
            else if (hour > 21 || hour < 6){
                return "Good night";
            }
            else {
                return  "Good moning";
            }
         }

}
