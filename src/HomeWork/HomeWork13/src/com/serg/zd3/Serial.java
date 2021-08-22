package HomeWork.HomeWork13.src.com.serg.zd3;

public class Serial implements Printable{
    @Override
    public void print() {
        System.out.println("Print a serial");
    }

    public static void printSerial(Printable[] printable) {
        for (Printable p: printable) {
            if (p instanceof Serial) p.print();
        }
    }
}
