package HomeWork.HomeWork23.src.com.serg.zd5;


public class Main {
    @FunctionalInterface
    interface Chislo{
        boolean print(int b);
    }

    public static void main(String[] args) {

        Chislo pr;

        pr = (x) -> (x%13)==0;
        System.out.print(pr.print(11));
    }

}
