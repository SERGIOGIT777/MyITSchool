package HomeWork.HomeWork5.src.com.serg;

public class Main9 {
    public static void main(String[] args) {
        var mass = new int[15];
        int a = 0;
       for (int i = 0; i < mass.length; i++) {
          mass[i] = (int)(Math.random()*2);
          if (mass[i] == 1 && a!=3) {
              a = mass[i] + a;
              System.out.print(mass[i] + " ");
              continue;
          }
           if (a == 3) mass[i] = 0;
          System.out.print(mass[i] + " ");
       }
    }
}
