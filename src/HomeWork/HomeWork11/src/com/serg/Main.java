package HomeWork.HomeWork11.src.com.serg;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 5;

        var tran = new Train[a];
        tran[0] = new Train("Minsk", 332, 10.23);
        tran[1] = new Train("Brest", 443, 12.45);
        tran[2] = new Train("Pinsk", 423, 17.54);
        tran[3] = new Train("Gomel", 665, 17.35);
        tran[4] = new Train("Grodno", 445, 16.32);

        while (true) {
            System.out.println(
                    "Выберете пункт меню:" + "\n" +
                            "1. сортировка по номерам поездов" + "\n" +
                            "2. вывод информации о поезде по номеру" + "\n" +
                            "3. закрыть программу"
            );
            int choice = scanner.nextInt();
            if (choice == 3) break;
            if (choice < 1 || choice > 2) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }

            switch (choice) {
                case 1:
                    Arrays.sort(tran, new Train.ByNumberComparator());
                    for (Train train : tran) {
                        train.info();
                    }
                    break;
                case 2:
                    System.out.println("введи индекс поезда: ");
                    int pos = scanner.nextInt();
                    if (pos < 0 || pos >= tran.length)
                        System.out.println("выбран неправильный номер элемента массива");
                    else
                        tran[pos].info();
                    break;
            }
        }
    }
}
