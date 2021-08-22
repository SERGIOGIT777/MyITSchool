package Lesson.Student6.src.com.serg;

public class Main {

    public static void main(String[] args) {
        int[][] mass = new int[][]
                {
                        {-1, 2, -3, 4, -5, 6, -7},
                        {8, -9, 10, -11, 12, -13, 14},
                        {-15, 16, -17, 18, -19, 20, -21},
                        {22, -23, 24, -25, 26, -27, 28},
                        {-29, 30, -31, 32, -33, 34, -35}
                };
           /*System.out.println("Matrix 90 grad");
           for (int i = 0; i < mass.length+2; i++) {
            for (int j = 0; j < mass.length; j++) {
               System.out.print(mass[mass.length - j - 1][i] + " ");
 //               System.out.print(mass[j][i] + " ");
            }
            System.out.println();
        }

         */
        /*System.out.println("Matrix - 90 grad");
        for (int i = mass.length+1; i >= 0; i--) {
            for (int j = 0; j < mass.length; j++) {
//                System.out.print(mass[mass.length - j - 1][i] + " ");
                               System.out.print(mass[j][i] + " ");
            }
            System.out.println();
        }

         */

        System.out.println("Matrix - 90 grad - zerkalo");
        for (int i = mass.length+1; i >= 0; i--) {
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[mass.length - j - 1][i] + " ");
//                System.out.print(mass[j][i] + " ");
            }
            System.out.println();
        }
    }
}
