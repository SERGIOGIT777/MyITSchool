package Lesson.Student14.src.com.serg.zd6;


public class Main {

    public static void main(String[] args) {
        try{
            Jurnal book = new Jurnal("War and Peace", "Leo Tolstoy");
            Jurnal book2 = book.clone();
            book2.setIsdatel("Ivan Turgenev");
            System.out.println(book.getIsdatel());
        }
        catch(CloneNotSupportedException ex){

            System.out.println("Cloneable not implemented");
        }
    }
}
