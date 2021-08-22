package HomeWork.HomeWork6.src.com.serg;

public class Main11 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int[][] mass = new int[][]
                {
                        {-1, 2, -3, 4, -5, 6, -7},
                        {8, -9, 10, -11, 12, -13, 14},
                        {-15, 16, -17, 18, -19, 20, -21},
                        {22, -23, 24, -25, 26, -27, 28},
                        {-29, 30, -31, 32, -33, 34, -35}
                };
        for (int[] ints : mass) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] < 0) ++a;
            }
            System.out.println("В строке - " + (i + 1) + " количество отрицательных элементов " + a);
            a=0;
        }
        for (int i = 0; i <= mass.length+1; i++) {
            for (int j = 0; j < mass.length; j++) {
                if (mass[mass.length-(j+1)][i] > 0) ++b;
            }
            System.out.println("В столбце - " + (i + 1) + " количество положительных элементов " + b);
            b=0;
        }
    }
}
