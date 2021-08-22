package HomeWork.HomeWork5.src.com.serg;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {
     int[] mass = new int[] {14, 67, 34, 23, 12, 6};
     int k = 0;
     int f = 0;
     int sum = 0;
     float sr = 0;
     for (int i = 0; i < mass.length; i++) {
         sum = mass[i] + sum;
         if (mass[k] < mass[i]) {
             k = i;
         }
         if (mass[f] > mass[i]) {
             f = i;
         }
         out.print(mass[i] + " ");
         sr = (float)sum/mass.length;
     }
     out.println();
     out.println("Максимальное значение = " + mass[k]);
     out.println("Минимальное значение = " + mass[f]);
     out.println("Среднее значение = " + sr);
    }
}
