package Lesson.Student5.src.com.serg;

public class Main {

    public static void main(String[] args) {
        int [] mass = {51, 143, 189};
//        for (int i = 0; i < mass.length; i++) {
//            System.out.println(mass[i]);
 //       }
        //------------------Цикл foreach -----------------
        for (int i: mass) {
            System.out.println(i);
        }
    }
}
