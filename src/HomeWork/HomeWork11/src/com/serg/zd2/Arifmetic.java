package HomeWork.HomeWork11.src.com.serg.zd2;

public class Arifmetic {
    private int a;
    private int b;

    public Arifmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void sum() {
        int c = a + b;
        System.out.printf("Сумма: %d \n", c);
    }

    public void max() {
        if(a < b) System.out.println("Число MAX = " + b + " наибольшее");
        else System.out.println("Число MAX = " + a + " наибольшее");
    }
}
