package Lesson.Student6.src.com.serg;

public class Main6 {
    public static void main(String[] args) {
        int [][]mass = new int [5][];
        mass[0] = new int []{1, 2, 3, 4, 5};
        mass[1] = new int []{1, 2, 3, 4};
        mass[2] = new int []{1, 2, 3};
        mass[3] = new int []{1, 2};
        mass[4] = new int []{1};
        for (int[] ints : mass) {
            for (int anInt : ints) {
                System.out.print(" " + anInt + " ");
            }
            System.out.println();
        }
    }
}
