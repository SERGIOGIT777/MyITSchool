package HomeWork.HomeWork22.src.com.serg.zd2;

public class Main {

    public static void main(String[] args) {
        String str = "One two three раз два три one1 two2 123";
        System.out.println("Исходная строка = " + str);
        str = str.replaceAll("[^A-z]+","");
        System.out.println("Преобразованная строка = " + str + ", количество латинских букв = " + str.length());
    }
}
