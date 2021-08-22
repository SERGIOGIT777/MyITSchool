package HomeWork.HomeWork5.src.com.serg;

public class Main5 {
    public static void main(String[] args) {
        int a;
        int a1 = 0;
        int a2 = 0;
        int a3 = 0;
        int a4 = 0;
        int a5 = 0;
        int a6 = 0;
        int a7 = 0;
        int a8 = 0;
        int a9 = 0;
        int a10 = 0;
        var mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = 10;
            System.out.print(mass[i] + " ");
            a1 = mass[i]+a1;
        }
        System.out.print("\n");
        var mass1 = new int [9];
        for (int i = 0; i < mass1.length; i++) {
            mass1[i] = 9;
            System.out.print(mass1[i] + " ");
            a2 = mass1[i]+a2;
        }
        System.out.print("\n");
        var mass2 = new int[8];
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = 8;
            System.out.print(mass2[i] + " ");
            a3 = mass2[i]+a3;
        }
        System.out.print("\n");
        var mass3 = new int[7];
        for (int i = 0; i < mass3.length; i++) {
            mass3[i] = 7;
            System.out.print(mass3[i] + " ");
            a4 = mass3[i]+a4;
        }
        System.out.print("\n");
        var mass4 = new int [6];
        for (int i = 0; i < mass4.length; i++) {
            mass4[i] = 6;
            System.out.print(mass4[i] + " ");
            a5 = mass4[i]+a5;
        }
        System.out.print("\n");
        var mass5 = new int[5];
        for (int i = 0; i < mass5.length; i++) {
            mass5[i] = 5;
            System.out.print(mass5[i] + " ");
            a6 = mass5[i]+a6;
        }
        System.out.print("\n");
        var mass6 = new int[4];
        for (int i = 0; i < mass6.length; i++) {
            mass6[i] = 4;
            System.out.print(mass6[i] + " ");
            a7 = mass6[i]+a7;
        }
        System.out.print("\n");
        var mass7 = new int [3];
        for (int i = 0; i < mass7.length; i++) {
            mass7[i] = 3;
            System.out.print(mass7[i] + " ");
            a8 = mass7[i]+a8;
        }
        System.out.print("\n");
        var mass8 = new int [2];
        for (int i = 0; i < mass8.length; i++) {
            mass8[i] = 2;
            System.out.print(mass8[i] + " ");
            a9 = mass8[i]+a9;
        }
        System.out.print("\n");
        var mass9 = new int[1];
        for (int i = 0; i < mass9.length; i++) {
            mass9[i] = 1;
            System.out.print(mass9[i] + " ");
            a10 = mass9[i]+a10;
        }
        a = a1+a2+a3+a4+a5+a6+a7+a8+a9+a10;
        System.out.print("\n");
        System.out.print("Сумма всех чисел = " + a);
    }
}
