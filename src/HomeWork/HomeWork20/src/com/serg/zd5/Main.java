package HomeWork.HomeWork20.src.com.serg.zd5;

public class Main {

    public static void main(String[] args) {
        String s = "Высококвалифицированный";
        for (int i = 3; i < s.length(); i=i+3) {
            System.out.print(s.charAt(i) + " ");
        }
    }
}
