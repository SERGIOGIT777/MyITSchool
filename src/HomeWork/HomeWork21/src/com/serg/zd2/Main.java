package HomeWork.HomeWork21.src.com.serg.zd2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        info();
    }

    public static void info(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Фамилия студента");
        String fio = sc.nextLine();
        System.out.println("Предмет");
        String predmet = sc.nextLine();
        System.out.println("Оценка по предмету");
        int znak = sc.nextInt();
        String inf = String.format("Студент %s получил оценку %d по предмету %s", fio, znak, predmet);
        System.out.println(inf);
    }
}
