package HomeWork.HomeWork28.src.com.serg.zd2;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(new FileInputStream("БОРОДИНО.txt"), "cp1251");
        FileWriter fw = new FileWriter("output2.txt");
        BufferedReader reader = new BufferedReader(in);

        Scanner scan = new Scanner(reader);
        while (scan.hasNextLine()){
            String s = scan.nextLine();
            fw.write(s);
            fw.write("\r\n");
        }
        reader.close();
        fw.close();
    }
}
