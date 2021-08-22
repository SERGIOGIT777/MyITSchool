package HomeWork.HomeWork6.src.com.serg;

public class Main7 {
    public static void main(String[] args) {
        var mass = new int [14];
        for (int i = 1; i < mass.length; i=i+2) {
          mass[i] = 1;
        }
        for (int i = 2; i < mass.length; i=i+2) {
            mass[i] = i % 5;
            if (mass[i] == 1) ++mass[i];
        }
        for (int value : mass) {
            System.out.print(value + " ");
        }
    }
}
