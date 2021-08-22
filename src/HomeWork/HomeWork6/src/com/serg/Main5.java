package HomeWork.HomeWork6.src.com.serg;

public class Main5 {
    public static void main(String[] args) {
        int[]mass = new int[10];
        int a;
        int b;
        int c;
        do {
            a = 0;
            b = 0;
            c = 0;
            for (int i = 0; i < mass.length; i++) {
                mass[i] = (int) (Math.random() * 3);
                if (mass[i] == 0) {
                    a++;
                }
                if (mass[i] == 1) {
                    b++;
                }
                if (mass[i] == 2) {
                    c++;
                }
                if (mass[i] == 1 && c == 0) {
                    i--;
                    a = 0;
                    b = 0;
                    c = 0;
                }
            }
        }while(b == a + c);
        for (int value : mass) {
            System.out.print(value + " ");
        }
    }
}
