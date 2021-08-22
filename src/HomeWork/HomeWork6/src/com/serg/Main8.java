package HomeWork.HomeWork6.src.com.serg;

public class Main8 {
    public static void main(String[] args) {
        var mass = new int [15];
        int a = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int)(Math.random()*11);
            if (mass[i]%3 == 0 && mass[i]%7 !=0) ++a;
            System.out.print(mass[i] + " ");
        }
        System.out.print("\nКоличество чисел по условию задачи = " + a);
    }
}
