package HomeWork.HomeWork6.src.com.serg;

import java.util.Arrays;

public class Main10 {
    public static void main(String[] args) {
        int[][] mass = new int[][]
                {
                        {12, 11, 10, 9},
                        {8, 7, 6, 5},
                        {4, 3, 2, 1}
                };
        int[][] mass1= new int[][]
                {
                        {9, 8, 7},
                        {6, 5, 4},
                        {3, 2, 1}
                };
        int[][] mass2= new int[][]
                {
                        {1, 4, 7},
                        {2, 5, 8},
                        {3, 6, 9}
                };
        int[][] mass3 = new int[][]
                {
                        {4, 3, 2, 1},
                        {8, 7, 6, 5},
                        {12, 11, 10, 9}
                };
        System.out.println("Вариант а");
        for (int[] ints : mass) {
            for (int anInt : ints) {

                System.out.print(anInt + ", ");
            }
            System.out.println();
        }
        System.out.println("Вариант б");
        for (int[] ints : mass1) {
            for (int anInt : ints) {

                System.out.print(anInt + ", ");
            }
            System.out.println();
        }
        System.out.println("Вариант с");
        for (int[] ints : mass2) {
            for (int anInt : ints) {

                System.out.print(anInt + ", ");
            }
            System.out.println();
        }
        System.out.println("Вариант d");
        for (int[] ints : mass3) {
            for (int anInt : ints) {

                System.out.print(anInt + ", ");
            }
            System.out.println();
        }
    }
}
