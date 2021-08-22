package HomeWork.HomeWork20.src.com.serg.zd8;

public class Main {

    public static void main(String[] args) {
        //String s = "Гипервысококвалифицированный";
        StringBuilder s = new StringBuilder("Гипер");
        s.append("o".repeat(Math.max(0, 12 - s.length())));
        System.out.print(s);
    }
}
