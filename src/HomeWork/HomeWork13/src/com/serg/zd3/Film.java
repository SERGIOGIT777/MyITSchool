package HomeWork.HomeWork13.src.com.serg.zd3;

public class Film implements Printable{
    @Override
    public void print() {
        System.out.println("Print a film");
    }

    public static void printFilms(Printable[] printable) {
        for (Printable p: printable) {
            if (p instanceof Film) p.print(); // является ли параметр объекта класса Film, если true - печатаем фильмы
        }
    }
}

