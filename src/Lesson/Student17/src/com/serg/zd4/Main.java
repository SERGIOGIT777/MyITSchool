package Lesson.Student17.src.com.serg.zd4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //Map and HashMap
 /*
        HashMap<Integer,String> passportandName = new HashMap<>();
        passportandName.put(1234567, "Sergio");
        passportandName.put(7632187, "Piter");
        passportandName.put(3426783, "Sem");

        //Перезапись по ключу

        passportandName.put(3426783, "Tom");

        //добавление элемента
        String JhonyName = passportandName.get(7632187);
       System.out.println(JhonyName);

        // System.out.println(passportandName);

        //удаление по ключу

        passportandName.remove(7632187);
        System.out.println(passportandName);

         */
        /*
        System.out.println(passportandName.containsKey(7632187));
        System.out.println(passportandName.containsValue("Brest"));
        
         */
/*
        //Извлечение ключей keys - первые значения

        Set<Integer> keys = passportandName.keySet();
        System.out.println("Keys: " + keys);

        //Извлечение строк value - второе значение

        ArrayList<String> values = new ArrayList<>(passportandName.values());
        System.out.println("Valuse: " + values);


        //Длина и очистка массива
        System.out.println(passportandName.size());
        passportandName.clear();
        System.out.println(passportandName + " " + passportandName.size());

        //Метод isEmpty

        if(!passportandName.isEmpty()) {
            System.out.println(passportandName);
        } else {
            System.out.println("Collection is clear");
        }
 */

        HashMap<Integer,String> passportandName = new HashMap<>();
        HashMap<Integer, String> passportandName2 = new HashMap<>();

        passportandName.put(1234567, "Sergio");
        passportandName.put(7632187, "Piter");
        passportandName.put(3426783, "Sem");

        passportandName2.put(4532956, "Sara");
        passportandName2.put(6543286, "Kara");
        passportandName2.put(8653426, "Thomas");
/*
        //Соединение коллекций
        passportandName.putAll(passportandName2);

        System.out.println(passportandName);
*/
        /*

        //Возвращение элементов коллекции
        for(Map.Entry entery: passportandName2.entrySet()){
            System.out.println(entery);
        }

         */

    }
}
