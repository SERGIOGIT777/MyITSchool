package HomeWork.HomeWork13.src.com.serg.zd1;

public class Main {
    public static void main(String[] args) {
        double temperature = 23.5;
        System.out.println("Цельсия t = " +
                new Celcia().getConvertedValue(temperature));
        System.out.println("Кельвина t = " +
                new Kelvin().getConvertedValue(temperature));
        System.out.println("Фаренгейта t = " +
                new Farengeit().getConvertedValue(temperature));
    }
}
