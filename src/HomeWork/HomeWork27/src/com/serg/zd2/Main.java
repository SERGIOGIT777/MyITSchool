package HomeWork.HomeWork27.src.com.serg.zd2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        ArrayList<Character> alphabet;
        alphabet = new ArrayList<Character>();
        for (int i = 0; i < 32; i++) {
            alphabet.add((char) ('а' + i));
        }
        alphabet.add(6, 'ё');

        //ввод строк
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }


        //Напишите тут ваш код

        int count = 0;
        //суперциклы. И че я так долго думал над этим?
        //сначала по алфавиту, потом по строке, потом по символу строки.
        for (char abs : alphabet) {
            for (String lonelyString : list) {
                for (char symbol : lonelyString.toCharArray()) {
                    if(abs == symbol)
                        count++;
                }
            }
            System.out.println(abs + " " + count);
            count = 0;
        }
    }
}
