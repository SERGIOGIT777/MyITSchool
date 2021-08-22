package HomeWork.HomeWork28.src.com.serg.zd4;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader in2 = new InputStreamReader(new FileInputStream("date.txt"), "cp1251");
        FileWriter fw1 = new FileWriter("date_day.txt");
        FileWriter fw2 = new FileWriter("date_month.txt");
        FileWriter fw3 = new FileWriter("date_year.txt");
        BufferedReader reader2 = new BufferedReader(in2);
        Scanner scan = new Scanner(reader2);

        while (scan.hasNextLine()){
            String s = scan.nextLine();
            Pattern p = Pattern.compile("^\\d+\\d");
            Pattern p1 = Pattern.compile("\\d+\\D");
            Pattern p2 = Pattern.compile("\\D+\\d+");
            Matcher m = p.matcher(s);
            Matcher m1 = p1.matcher(s);
            Matcher m2 = p2.matcher(s);
            String s1 = "";
            String s2 = "";
            String s3 = "";
            while(m.find()){
                s1 = s.substring(m.start(), m.end());
            }
            while (m1.find()){
                s2 = s.substring(m1.start(), m1.end());
                s2 = s2.replaceAll("\\D","");
            }
            while (m2.find()){
                s3 = s.substring(m2.start(), m2.end());
                s3 = s3.replaceAll("\\D","");
            }
            fw1.write(s1);
            fw2.write(s2);
            fw3.write(s3);
            fw1.write("\r\n");
            fw2.write("\r\n");
            fw3.write("\r\n");
        }
        reader2.close();
        fw1.close();
        fw2.close();
        fw3.close();
    }
}
