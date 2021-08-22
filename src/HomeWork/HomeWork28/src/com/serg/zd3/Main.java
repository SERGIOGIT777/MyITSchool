package HomeWork.HomeWork28.src.com.serg.zd3;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader in1 = new InputStreamReader(new FileInputStream("БОРОДИНО.txt"), "cp1251");
        FileWriter fw = new FileWriter("output3.txt");
        BufferedReader reader1 = new BufferedReader(in1);
        int n = 111;
        Scanner scan = new Scanner(reader1);

        if (scan.hasNextLine()) {
            for (int i = 0; i<n-3; i++){
            String s = scan.nextLine();
            fw.write(s);
            fw.write("\r\n");
        }
        }
        reader1.close();
        fw.close();
    }
}
