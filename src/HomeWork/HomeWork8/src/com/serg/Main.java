package HomeWork.HomeWork8.src.com.serg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Ваш день недели: " + nedeli());
    }
    static String nedeli(){
        System.out.print("Введите цифрой день недели - ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a>0 && a<=7) {
            String[] mass = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};
            for (int i = 0; i < mass.length; i++) {
            if (a == i+1) {
                final String mass1 = mass[i];
                return mass1;}
        }
        } else {
            System.out.print("Нет такого дня недели!!!\n");
            return nedeli();
        }
        return null;
    }
}
