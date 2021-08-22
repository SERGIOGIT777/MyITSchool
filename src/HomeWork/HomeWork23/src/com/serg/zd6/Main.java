package HomeWork.HomeWork23.src.com.serg.zd6;


public class Main {
    @FunctionalInterface
    interface Stroka{
        String print(String a, String b);
    }

    public static void main(String[] args) {

        Stroka pr;

        pr = (a, b) -> {if (a.length()>b.length()) 
                            return a;
                        else return b;};
        System.out.print(pr.print("Мама мыла раму", "Мама мыла"));
    }

}
