package HomeWork.HomeWork11.src.com.serg.zd3;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        Libr library = new Libr("", "");
        ArrayList<Libr> lib = new ArrayList<>();
        while (true) {
            System.out.println("Вводить книги в билиотеку - да/нет");
            String vibor = sc.nextLine();
            String nazv = "";
            String god = "";
            if (vibor.equals("да")) {
                System.out.print("Название книги - ");
                nazv = sc.nextLine();
                System.out.print("\nГод издания - ");
                god = sc.nextLine();
            }
            System.out.println(
                    "Выберете пункт меню:" + "\n" +
                            "1. Добавление книг в библиотеку" + "\n" +
                            "2. Удаление книг из библиотеки" + "\n" +
                            "3. Показать библиотеку" + "\n" +
                            "4. Поиск книг" + "\n" +
                            "5. Сортировка книг" + "\n" +
                            "6. закрыть программу"
            );
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 6) break;
            if (choice < 1 || choice > 6) {
                System.out.println("выбран неправильный пункт меню, повторите ввод.");
                continue;
            }
            switch (choice) {
                case 1:
                    library.setName(nazv);
                    library.setYear(god);
                    lib.add(new Libr(library.getName(),library.getYear()));
                    library.info();
                    break;
                case 2:
                    System.out.print("Удалить по какому индексу - ");
                    int id = sc.nextInt();
                    lib.remove(id);
                    break;
                case 3:
                    System.out.print(lib+ "\n");
                    break;
                case 4:
                    System.out.print("Введите имя книги - ");
                    String findName = sc.nextLine();
                    System.out.print("\nВведите год издания - ");
                    String findYear = sc.nextLine();
                    lib.stream().filter(Libr -> Libr.getName().equals(findName) &&
                            Libr.getYear().equals(findYear)).forEach(Libr -> System.out.println("Искомые данные: " + Libr));
                    break;
                case 5:
                    System.out.println("Сортировать по - имя/год");
                    String sor = sc.nextLine();
                    if (sor.equals("имя")) {
                        lib.sort(new Libr.LibrComparatorName());
                        System.out.print(lib + "\n");
                    }
                    if (sor.equals("год")) {
                        lib.sort(new Libr.LibrComparatorYear());
                        System.out.print(lib + "\n");
                    }
                    break;
            }
        }
    }
}
