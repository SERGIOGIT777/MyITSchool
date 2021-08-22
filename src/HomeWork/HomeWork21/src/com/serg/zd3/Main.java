package HomeWork.HomeWork21.src.com.serg.zd3;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Выберете метод поиска цифр:" + "\n" +
                        "1. Рекурсивный метод" + "\n" +
                        "2. Метод строковый"
        );
        int point = sc.nextInt();
        switch (point){
            case 1: infoRecurs(); break;
            case 2: infoBuilder(); break;
        }

    }
    public static void infoRecurs(){
        String str = "3hjb3h4h23hhb2323bjhbjhbh&^&^&%^342";
        str = str.replaceAll("[^0-9]+","");
        System.out.println("Строка цифр = " + str + ", количество цифр = " + str.length());
    }

    public static void infoBuilder(){
        String str = "3hjb3h4h23hhb2323bjhbjhbh&^&^&%^342";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++)
            if (Character.isDigit(str.charAt(i))) {
                int elem = Character.digit(str.charAt(i), 10);
                sb.append(elem);
            }
        System.out.println("Строка цифр = " + sb + ", количество цифр = " + sb.length());
    }
}
