package Lesson.Student6.src.com.serg;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner nex = new Scanner(System.in);
        System.out.print("Введите размер матрицы - ");
        int n = nex.nextInt();
        String[][] mass = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i+j)%2 == 0) mass[i][j] = "W"; else mass[i][j] = "B";
            }
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
