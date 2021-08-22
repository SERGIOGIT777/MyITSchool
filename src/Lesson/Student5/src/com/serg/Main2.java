package Lesson.Student5.src.com.serg;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        //-------------Запись из массива в массив - увеличение------
        /*String [] gorod = {"London", "Brest", "Minsk", "USA"};
        String [] gorod2 = new String [gorod.length+1];
        for (int i = 0; i < gorod.length; i++){
            gorod2[i] = gorod[i];
        }
        gorod2[gorod.length] = "Pinsk";
      /////////////////////////////////////////
         */

        /*ArrayList<String> gorod = new ArrayList<>();

        gorod.add("Pinsk");
        gorod.add("Minsk");
        gorod.add("Brest");
        gorod.add("London");

        gorod.add(0,"USA");
        System.out.print(gorod);
       ///////////////////////////////
         */
        /*ArrayList<String> gorod = new ArrayList<>();

        gorod.add("Pinsk");
        gorod.add("Minsk");
        gorod.add("Brest");
        gorod.add("London");

        System.out.print(gorod.get(2)); //получение индекса
        System.out.println(gorod.indexOf("Brest")); //Получение элемента
        System.out.println(gorod.indexOf("London"));
        System.out.print(gorod.indexOf("USA"));

         */

        /*ArrayList<String> gorod = new ArrayList<>();

        gorod.add("Pinsk");
        gorod.add("Minsk");
        gorod.add("Brest");
        gorod.add("London");

        System.out.println(gorod.set(1,"USA"));
        System.out.println(gorod.get(1));

         */

        ArrayList<String> gorod = new ArrayList<>();

        gorod.add("Pinsk");
        gorod.add("Minsk");
        gorod.add("Brest");
        gorod.add("London");

        gorod.remove(1);
        gorod.remove("Brest");
        System.out.println(gorod);
    }
}
