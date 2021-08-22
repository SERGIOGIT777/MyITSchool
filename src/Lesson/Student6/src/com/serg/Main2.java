package Lesson.Student6.src.com.serg;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        /*int [][] mass = {
                {23, 45, 54},
                {72, 67, 26},
                {23, 54, 32}
        } ;
        System.out.println(Arrays.deepToString(mass));

         */
        /*int [][] masstwo = {
                {2, 3, 4, 7},
                {5, 6, 7, 4},
                {8, 9, 10, 14}
        };
        System.out.println(masstwo[0].length);

         */
        int n = 3;
        int [][] mass = new int [n][n];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = n * i + j;//заполнение матрицы
            }
        }
        System.out.println("Начальная матрица: ");
        for (int[] ints : mass) {
            for (int anInt : ints) {
                System.out.printf("%3d", anInt);
            }
            System.out.println();
        }
        //--------транспонирование матрицы--------------
        for(int i = 0; i < mass.length; i++){
            for (int j = i+1; j < mass[i].length; j++){
                int temp = mass[i][j];
                mass[i][j] = mass[j][i];
                mass[j][i]=temp;
            }
        }
        System.out.println("\nТранспонированная матрица: ");
        for (int[] ints : mass) {
            for (int anInt : ints) {
                System.out.printf("%3d", anInt);
            }
            System.out.println();
        }
    }
}
