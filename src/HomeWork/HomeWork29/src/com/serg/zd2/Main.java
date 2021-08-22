package HomeWork.HomeWork29.src.com.serg.zd2;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader ins = new InputStreamReader(new FileInputStream("text.txt"), "cp1251");
        BufferedReader reader = new BufferedReader(ins);
        Scanner scan = new Scanner(reader);

        System.out.println("Календарь праздников: ");
            while (scan.hasNextLine()){
                String a = scan.nextLine();
                String s1 = a.substring(0,2);
                String s2 = a.substring(3,5);
                String s3 = a.substring(6,10);
                String s4 = a.substring(11);
                int a1 = Integer.parseInt(s1);
                int a2 = Integer.parseInt(s2);
                int a3 = Integer.parseInt(s3);
                LocalDate dateL = LocalDate.of(a3, a2, a1);
                System.out.println(dateL.format(DateTimeFormatter.ofPattern("dd.MM.uuuu")) + " " + s4);
            }
        reader.close();
        }
}
