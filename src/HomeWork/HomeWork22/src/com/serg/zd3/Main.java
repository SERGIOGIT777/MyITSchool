package HomeWork.HomeWork22.src.com.serg.zd3;

public class Main {

    public static void main(String[] args) {
        String str = "Versions: Java  5, Java 6, Java   7, Java 8, Java 12.";
        System.out.println("Исходная строка = " + str);
        str = str.replaceAll("[^Jav]+"," ");
        System.out.println("Преобразованная строка = " + str);
    }
}
