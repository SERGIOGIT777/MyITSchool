package HomeWork.HomeWork5.src.com.serg;

public class Main7 {
    public static void main(String[] args) {
        var mass = new int[3];
        int d = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int)(Math.random()*100);
            if (d != mass[i]) d = mass[i] + d;
            System.out.print(mass[i] + " ");
        }
    }
}
