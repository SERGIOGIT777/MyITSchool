package HomeWork.HomeWork20.src.com.serg.zd4;

public class Main {

    public static void main(String[] args) {
        String s = "Мама мыла раму, стальная рама";
        int lsymbol = s.charAt(s.length()-1);
        for (int i = 0; i < s.length(); i++) {
            if (lsymbol == s.charAt(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
