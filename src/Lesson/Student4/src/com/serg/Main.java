package Lesson.Student4.src.com.serg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    	//---------------Метод toUpperCase() - заглавные буквы

    /*String rezult = "I live in city Brest \n";
	String res = rezult.toUpperCase();
	System.out.print(res);
	String rezult1 = "I live in city Brest s 1980";
	String res1 = rezult1.toUpperCase();
	System.out.print(res1);
	 */

		//---------------Метод toLowerCase() - строчные буквы

		/*String rezult = "I live in city Brest \n";
		String res = rezult.toLowerCase();
		System.out.print(res);
		String rezult1 = "I live in city Brest s 1980";
		String res1 = rezult1.toLowerCase();
		System.out.print(res1);
		 */


		//---------------Метод equals - сравнение строк

		/*String rezult = "I live in city Brest \n";
		String rezult1 = "I live in city Brest s 1980";
		System.out.println(rezult.equals(rezult1));

		 */


		//--------------------Массивы-----------------


		/*int [] array = {2, 5, 78};
		String [] array1 = {"My", "Home", "City"};
		int a = array.length;
		 */

		/*int [] array = {2, 4, 6};
		int a = array.length;
		System.out.println(a);
		 */
		/*int [] array = new int[4];
		array[0] = 45;
		array[1] = 67;
		array[2] = 56;
		array[3] = 58;
		System.out.println(array[0]);

		 */
         /*int[] mass = new int[15];
        int b = 0;
        for (int a = 0; a<mass.length; a++) {
            mass[a] = (int)(Math.random()*10);
            //System.out.print(mass[a] + " ");
            if (mass[a] % 2 == 0) System.out.print(mass[a] + " ");
            if (mass[a] %2 != 0) b++;
        }
        System.out.println();
        System.out.print("Остаток нечетных элементов массива = " + b);

         */
        /*int[] mass = new int[8];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int)((Math.random()*10)+1);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mass.length; i=i+2) {
            mass[i] = 0;
        }

        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }

         */
        /*int [] mass1 = new int[5];
        int [] mass2 = new int[5];
        float ar1 = 0;
        float ar2 = 0;
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = (int)(Math.random()*5);
            System.out.print(mass1[i] + " ");
            ar1 = mass1[i] + ar1;
        }
        ar1 = ar1/mass1.length;
        System.out.println();
        for (int j = 0; j < mass2.length; j++) {
            mass2[j] = (int)(Math.random()*5);
            System.out.print(mass2[j] + " ");
            ar2 = mass2[j] + ar2;
        }
        System.out.println();
        ar2 = ar2/mass2.length;
        System.out.println("Среднее арифмитическое 1-го массива - " + ar1);
        System.out.println("Среднее арифмитическое 2-го массива - " + ar2);
        if (ar1 < ar2) System.out.println("Значение 2-го массива больше");
        else if (ar2 < ar1) System.out.println("Значение 1-го массива больше");
        else System.out.println("Значения массивов равные");

         */

        /*int[] mass = new int[4];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) ((Math.random() * 90) + 10);
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        if (mass[0] < mass[1] && mass[1] < mass[2] && mass[2] < mass[3])
        System.out.println("Возрастающая последовательность");

         */
// Число фибоначчии
        int [] mass = new int[20];
        int a = 1;
        int b = 1;
        System.out.print(b + " " + a + " ");
        for (int i = 0; i < mass.length-2; i++) {
            mass[i] = b + a;
            a = b;
            b = mass[i];
            System.out.print(mass[i] + " ");
        }


    }
}
