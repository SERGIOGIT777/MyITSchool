package Lesson.Student6.src.com.serg;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner nex = new Scanner(System.in);
        System.out.print("Введите размер матрицы - нечетную - ");
        int n = nex.nextInt();
        int[][] mass = new int[n][n];
        for (int i = 0; i < n; i++) {
                mass[i][i] = n*i + (i+1);
        }
        System.out.print("Наша матрица\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
