package HomeWork.HomeWork6.src.com.serg;

public class Main {

    public static void main(String[] args) {
        int [] mass = new int [15];
        int a = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 2);
            if (mass[i] == 1) {
                a = mass[i] + a;
                System.out.print(mass[i] + " ");
            } else {
                mass[i] = 0;
                System.out.print(mass[i] + " ");
            }
        }
    }
}
