package Lesson.Student8.src.com.serg;

public class Main5 {

    //-------------Перегрузка методов------------

    /*public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(5,6,7));
        System.out.println(sum(4.3,7.9));
    }
    static int sum(int x, int y) {
        return x + y;
    }

    static double sum(double x, double y) {
        return x+y;
    }

    static int sum(int x, int y, int z) {
        return x + y + z;
    }

     */

    public static void main(String[] args) {
        System.out.println(sum(1,5));
        System.out.println(sum(1,5,4));
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static double sum(int x, int y, int z) {
        return  x + y + z;
    }
}
