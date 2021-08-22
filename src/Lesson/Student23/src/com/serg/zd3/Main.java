package Lesson.Student23.src.com.serg.zd3;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
       /* (int a, int b) -> {return a+b;}
        () -> System.out.println("Hello word");
        (String s) -> {System.out.println(s);}
        () -> 87;*/

        //Runnable r = () -> System.out.println("Hello word!!!");

       /* new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }).start();

        new Thread(
                () -> System.out.println("Hello")
        ).start();*/


       /* List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for(Integer n: list){
            System.out.println(n);
        }

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        list1.forEach(n ->System.out.println(n));

        list1.forEach(System.out::println);*/

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Вывод всех чисел: ");
        evalute(list, (n)->true);

        System.out.print("Не выводим ни одного числа: ");
        evalute(list, (n)->false);

        System.out.print("Вывод четных чисел: ");
        evalute(list, (n)-> n % 2 == 0);

        System.out.print("Вывод нечетных чисел: ");
        evalute(list, (n)-> n % 2 == 1);

        System.out.print("Вывод чисел больше 5: ");
        evalute(list, n-> n > 5);
    }

    public static void evalute(List<Integer> list, Predicate<Integer> predicate){
        for(Integer n: list){
            if (predicate.test(n)){
                System.out.print(n + " ");
            }
        }
        System.out.println();
    }
}
