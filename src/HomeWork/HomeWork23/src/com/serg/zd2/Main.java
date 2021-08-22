package HomeWork.HomeWork23.src.com.serg.zd2;


public class Main {
    @FunctionalInterface
    interface Printable{
        void print();
    }

    public static void main(String[] args) {
        Printable pr;
        pr = () -> System.out.println("TEST");
        pr.print();
    }

}
