package HomeWork.HomeWork17.src.com.serg.zd2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Product pr1 = new Product("Детская игрушка");
        Product pr2 = new Product("Игрушка для девочек");
        Product pr3 = new Product("Игрушка для мальчиков");
        HashMap<String, Product> magaz = new HashMap<>();
        magaz.put("Мишка", pr1);
        magaz.put("Кукла", pr2);
        magaz.put("Машинка", pr3);

        for (Map.Entry coll: magaz.entrySet()){
            System.out.println(coll);
        }

        System.out.println("\nНаименование игрушек");

        ArrayList imei = new ArrayList<>(magaz.values());
        System.out.println(imei);

        System.out.println("\nИгрушка");

        ArrayList<String> name = new ArrayList<>(magaz.keySet());
        System.out.println(name);
    }
}
