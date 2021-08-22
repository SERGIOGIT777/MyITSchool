package HomeWork.HomeWork12.src.com.serg.zd3;

import javax.swing.*;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User magazin = new User("admin", "admin");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите логин");
        String log = sc.nextLine();
        System.out.println("Введите пароль");
        String pas = sc.nextLine();
        if (log.equals(magazin.getLogin()) && pas.equals(magazin.getPassword())) {
            System.out.print("Добро пожаловать в интернет-магазин\n");
            System.out.println();

            var tovar = new Tovar[10];

            tovar[0] = new Tovar("Western Digital Caviar Blue 1 TB (WD10EZEX)", 1340, 3);
            tovar[1] = new Tovar("Transcend StoreJet 25M3 1 TB (TS1TSJ25M3)", 1858, 5);
            tovar[2] = new Tovar("Samsung 750 Evo 120 GB (MZ750120BW)", 1708, 2);
            tovar[3] = new Tovar("Western Digital Caviar Black 1 TB (WD1002FAEX)", 997, 1);
            tovar[4] = new Tovar("Kingston SSDNow V300 120 GB (SV300S37A/120G)", 1703, 4);
            tovar[5] = new Tovar("Toshiba Canvio Basics 1 TB (HDTB310EK3AA)", 1558, 3);
            tovar[6] = new Tovar("Kingston SSDNow UV400 120 GB (SUV400S37/120G)", 1562, 5);
            tovar[7] = new Tovar("Seagate Pipeline HD 160 GB (ST3160310CS)", 245, 3);
            tovar[8] = new Tovar("Kingston SSDNow V300 240 GB (SV300S37A/240G)", 2524, 1);
            tovar[9] = new Tovar("Samsung 960 Evo M.2 250 GB (MZV6E250BW)", 4050, 2);

            for (Tovar value : tovar) {
                value.info();
            }

            while (true) {
                System.out.println(
                        "Выберете пункт меню:" + "\n" +
                                "1. сортировка по имени товара" + "\n" +
                                "2. сортировка по цене" + "\n" +
                                "3. сортировка по рейтингу" + "\n" +
                                "4. купленные товары" + "\n" +
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
                        Category hdd = new Category("HDD", Comparator.comparing(Tovar::getName));
                        fillCategory(hdd);
                        printTovars(hdd);
                        break;
                    case 2:
                        hdd = new Category("HDD", Comparator.comparingDouble(Tovar::getPrice));
                        fillCategory(hdd);
                        printTovars(hdd);
                        break;
                    case 3:
                        hdd = new Category("HDD", (o1, o2) -> {
                            int ratingDiff = Integer.compare(o1.getRating(), o2.getRating());
                            return ratingDiff != 0 ? ratingDiff : 1;
                        });
                        fillCategory(hdd);
                        printTovars(hdd);
                        break;
                    case 4:
                        Basket shop = new Basket(Comparator.comparing(Tovar::getName));
                        fillShop(shop);
                        printCategory(shop);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + choice);
                }
            }
        } else {
            System.out.print("Неправильный логин или пароль");
        }
    }

    public static void fillCategory(Category category) {
        category.addTovar(new Tovar("Western Digital Caviar Blue 1 TB (WD10EZEX)", 1340, 3));
        category.addTovar(new Tovar("Transcend StoreJet 25M3 1 TB (TS1TSJ25M3)", 1858, 5));
        category.addTovar(new Tovar("Samsung 750 Evo 120 GB (MZ750120BW)", 1708, 2));
        category.addTovar(new Tovar("Western Digital Caviar Black 1 TB (WD1002FAEX)", 997, 1));
        category.addTovar(new Tovar("Kingston SSDNow V300 120 GB (SV300S37A/120G)", 1703, 4));
        category.addTovar(new Tovar("Toshiba Canvio Basics 1 TB (HDTB310EK3AA)", 1558, 3));
        category.addTovar(new Tovar("Kingston SSDNow UV400 120 GB (SUV400S37/120G)", 1562, 5));
        category.addTovar(new Tovar("Seagate Pipeline HD 160 GB (ST3160310CS)", 245, 3));
        category.addTovar(new Tovar("Kingston SSDNow V300 240 GB (SV300S37A/240G)", 2524, 1));
        category.addTovar(new Tovar("Samsung 960 Evo M.2 250 GB (MZV6E250BW)", 4050, 2));
    }

    public static void fillShop(Basket basket) {
        basket.addTovar(new Tovar("Samsung 750 Evo 120 GB (MZ750120BW)", 1708, 2));
        basket.addTovar(new Tovar("Samsung 960 Evo M.2 250 GB (MZV6E250BW)", 4050, 2));
    }

    public static void printTovars(Category category) {
        Iterator<Tovar> iterator = category.getTovarSet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }

    public static void printCategory(Basket basket) {
        Iterator<Tovar> iterator = basket.getTovarSet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println();
    }
}
