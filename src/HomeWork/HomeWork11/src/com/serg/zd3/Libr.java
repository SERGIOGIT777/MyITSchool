package HomeWork.HomeWork11.src.com.serg.zd3;

import java.util.Comparator;

public class Libr {
    private String name;
    private String year;

    public Libr(String name, String year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return name + " " + year;}

    public void info() {
        System.out.println("Название книги: " + name + ", год издания: " + year);
    }

    public static class LibrComparatorName implements Comparator<Libr> {
        @Override
        public int compare(Libr a, Libr b) {

            return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
        }
    }

    public static class LibrComparatorYear implements Comparator<Libr> {
        @Override
        public int compare(Libr a, Libr b) {

            return a.getYear().toUpperCase().compareTo(b.getYear().toUpperCase());
        }
    }


}
