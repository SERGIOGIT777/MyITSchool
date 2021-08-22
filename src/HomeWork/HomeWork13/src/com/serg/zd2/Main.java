package HomeWork.HomeWork13.src.com.serg.zd2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько BYN поменять = ");
        double val = sc.nextDouble();
        while (true) {
            System.out.println(
                    "Выберете пункт меню:" + "\n" +
                            "1. Количество долларов" + "\n" +
                            "2. Количество евро" + "\n" +
                            "3. Из долларов в евро" + "\n" +
                            "4. Из евро в доллары" + "\n" +
                            "5. закрыть программу"
            );
            int choice = sc.nextInt();
            if (choice == 5) break;
            if (choice < 1 || choice > 5) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            switch (choice) {
                case 1:
                    System.out.println("USD = " +
                            new USD().getConvertedValue(val));
                    break;
                case 2:
                    System.out.println("EURO = " +
                            new EURO().getConvertedValue(val));
                    break;
                case 3:
                    USD us = new USD();
                    double us1 = new USD().getConvertedValue(val);
                    us.setValue(0.67);
                    System.out.println("Из ДОЛАРОВ в ЕВРО = " + (us1 * us.getValue()));
                    break;
                case 4:
                    EURO er = new EURO();
                    double er1 = new EURO().getConvertedValue(val);
                    er.setValue(1.25);
                    System.out.println("Из ЕВРО в доллары = " + (er1 * er.getValue()));
                    break;
            }
        }
    }
}
