package Lesson.Student20.src.com.serg.zd4;

public class Main {

    public static void main(String[] args) {
        /*String str = "Для работы со строками в языке Java используется метод compateTo";
        System.out.println(str);
        
        System.out.println("indexOf(a) = " + str.indexOf('a'));
        System.out.println("lastindexOf(a) = " + str.lastIndexOf('o'));
        System.out.println();

        System.out.println("Indexof(Java) = " + str.indexOf("Java"));
        System.out.println("LastIndexOf(Java) = " + str.lastIndexOf("om"));

        System.out.println();

        System.out.println("indexOf(a, 40) = " + str.indexOf('a', 40));
        System.out.println("LastIndexOf(о, 90) = " + str.lastIndexOf('o', 90));
        */

        /*System.out.println("Hello".concat("word!"));
        System.out.println("Hello".replace('l', 'w'));
        System.out.println("Hello".toLowerCase());
        System.out.println("Hello".toUpperCase());
        System.out.println("          Hello word     ".trim());
        */

        System.out.println("Welcome to Java!".substring(10));
        System.out.println("Welcome to Java!".substring(10,13));

        String result = String.join(" : ", "footbal", "foot", "ball");
        System.out.println(result);
    }
}
