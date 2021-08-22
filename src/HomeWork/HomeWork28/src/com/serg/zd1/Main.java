package HomeWork.HomeWork28.src.com.serg.zd1;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("output.txt");
        System.out.println("Введите строки: ");
        Scanner sc = new Scanner(System.in);
        File f1 = new File("output.txt");
        FileWriter fw = new FileWriter(f1);
        String st = "";
        while (!st.equals("stop")){
        st = sc.nextLine();
        fw.write(st + "\n");
        }
        fw.close();
    }
}
