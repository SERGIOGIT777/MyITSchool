package Lesson.Student6.src.com.serg;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner nex = new Scanner(System.in);
        System.out.print("Введите размер матрицы - нечетную - ");
        int n = nex.nextInt();
        int[][] mass = new int[n][n];
        for (int i = 0; i < n; i++) {
            mass[i][i] = 1; // заполнение 1 по диагонали
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
