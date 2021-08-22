package Lesson.Student6.src.com.serg;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
       /* //массив в 3 этажа на каждом этаже 10 мест - 2*5
        boolean [][][] parking = new boolean[3][2][5];
        parking[0][1][0] = true;
        parking[0][1][3] = true;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                for (int l = 0; l < 5; l++) {
                    System.out.print("mass[" + i + "][" + j + "][" + l + "] = " + parking[i][j][l] + "\t");
                }
            }
            System.out.println();

        }

        */
        Scanner nex = new Scanner(System.in);
        System.out.print("Введите размер матрицы - ");
        String a = "87654321";
        String b = "abcdefgh";
        int n = nex.nextInt();
        String[][] mass = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                    if ((i + j) % 2 == 0) mass[i][j] = "W" + (Character.toString(a.charAt(i))+b.charAt(j)); else mass[i][j] = "B" + (Character.toString(a.charAt(i))+b.charAt(j));

            }
        }
        System.out.print("Наша матрица\n");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {
                    System.out.print(mass[i][j] + " ");
                }
                System.out.println();
            }
        }

        /*String [][][] mass = new String[6][3][3];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                for (int l = 0; l < 3; l++) {

                    System.out.print(mass[i][j][l] + "\t");
                }
            }
            System.out.println();

        }

         */
    }
}
