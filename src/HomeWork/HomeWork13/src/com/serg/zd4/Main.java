package HomeWork.HomeWork13.src.com.serg.zd4;

import com.sun.management.GcInfo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gitar gitara = new Gitar(5);
        Baraban baraban = new Baraban(6);
        Truba truba = new Truba(4);
        System.out.println("Количество струн гитары = ");
        int str = sc.nextInt();
        System.out.println("Размер барабана = ");
        int bar = sc.nextInt();
        System.out.println("Диаметр трубы = ");
        int tr = sc.nextInt();
        gitara.setStruni(str);
        baraban.setSize(bar);
        truba.setDiametr(tr);
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Gitar(str);
        instruments[1] = new Baraban(bar);
        instruments[2] = new Truba(tr);

        for (Instrument instrument : instruments) {
            instrument.play(Instrument.KEY);
        }
    }
}
