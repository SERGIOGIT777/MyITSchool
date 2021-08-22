package Lesson.Student21.src.com.serg.zd2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*StringBuffer sb = new StringBuffer();
	StringBuffer sb1 = new StringBuffer();
	StringBuffer sb2 = new StringBuffer();
	System.out.println(sb.append("3+56=59"));
	System.out.println(sb1.append("3-56=-53"));
	System.out.println(sb2.append("3*56=168"));
	/*System.out.println(sb.replace(4, 5, "равно"));
	System.out.println(sb1.replace(4, 5, "равно"));
	System.out.println(sb2.replace(4, 5, "равно"));*/
    /*System.out.println(sb.delete(4,5));
    System.out.println(sb1.delete(4,5));
    System.out.println(sb2.delete(4,5));
    System.out.println(sb.insert(4, "равно"));
    System.out.println(sb1.insert(4, "равно"));
    System.out.println(sb2.insert(4, "равно"));*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово = ");
        String s = sc.nextLine();
        String sb = new StringBuffer(s).reverse().toString();
        if(s.equalsIgnoreCase(sb)) {
            System.out.println("Слово палиндром");
        } else System.out.println("Слово не палиндром");


    }
}
