package HomeWork.HomeWork13.src.com.serg.zd3;

public class Main {

    public static void main(String[] args) {
        Printable[] printables = new Printable[4];
        printables[0] = new Film();
        printables[1] = new Serial();
        printables[2] = new Film();
        printables[3] = new Serial();

        for (Printable printable : printables) {
            printable.print();
        }
        Film.printFilms(printables);
        Serial.printSerial(printables);
    }
}
