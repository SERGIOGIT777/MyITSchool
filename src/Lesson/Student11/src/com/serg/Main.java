package Lesson.Student11.src.com.serg;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*Person kate = new Person("Kate", 33,
                "Brest", "+375298265296");
        kate.displayName(); // работает
        kate.displayAge(); // работает
        //kate.displayAddress();// ошибка - метод приватный
        kate.displayPhone(); // работает

        System.out.println(kate.name); // дефолтный, работает
        System.out.println(kate.age); // защитныйб работает
        System.out.println(kate.address); // публичный, работает
       // System.out.println(kate.phone); // приватный, ошибка

         */
        /*
        Person kate = new Person("kate", 30);
        System.out.println(kate.getAge());

        kate.setAge(45);
        System.out.println(kate.getAge());

        kate.setAge(120);
        System.out.print(kate.getAge());

         */

        /*double radius = 60;
        System.out.printf("Радиус: %f \n", radius);
        System.out.printf("Площадь: %f \n", Math.PI*radius);

         */

        /*Person.displayCounter();

        Person tom = new Person();
        Person ann = new Person();

        //tom.displayID(); // id = 105
        //ann.displayID(); // id = 106

        Person.displayCounter();

         */
        /*
        System.out.println(Operation.sum(23, 99));
        System.out.println(Operation.subtract(23, 99));
        System.out.println(Operation.multiplay(23, 99));

         */

        /*Person tom = new Person("Tom");
        System.out.println(tom.getName());
        changeName(tom);
        System.out.println(tom.getName());

         */

        /*Person jonny = new Person("Jonny");
        System.out.println(jonny.getName());

        Person Maks = changePerson(jonny);
        System.out.println(jonny.getName());

         */

        Scanner scanner = new Scanner(System.in);

        int a = 5;

        var tran = new Train[a];
        tran[0] = new Train("Minsk", 332, 10.00);
        tran[1] = new Train("Brest", 443, 12.45);
        tran[2] = new Train("Pinsk", 423, 17.54);
        tran[3] = new Train("Gomel", 665, 17.35);
        tran[4] = new Train("Spb", 445, 16.32);

        while (true) {
            System.out.println(
                    "Выберете пункт меню:" + "\n" +
                            "1. сортировка по номерам поездов" + "\n" +
                            "2. вывод информации о поезде по номеру" + "\n"
            );
            int choice = scanner.nextInt();
            if (choice == 2)
                break;
            if (choice < 1 || choice > 2) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }

            switch (choice) {
                case 1:
                    Arrays.sort(tran, new Train.ByNumberComparator());
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


  /*  static void changeName(Person a) {
        a.setName("Cris");
    }

    static Person changePerson(Person b) {
        b = new Person("Maks");
        b.setName("Karl");
        return b;
    }

   */
}
