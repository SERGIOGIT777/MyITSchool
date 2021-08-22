package HomeWork.HomeWork9.src.com.serg;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Reader student = new Reader();

        System.out.print("Введиту ФИО читателя: ");
        student.FIO = getStr();

        System.out.print("Введите номер читательского билета: ");
        student.number = getNum();

        System.out.print("Введиту факультет читателя: ");
        student.Facultet = getStr();

        System.out.print("Введиту дату рождения читателя: ");
        student.DateRog = getStr();

        System.out.print("Введите телефон читателя: ");
        student.phone = getNum();

        System.out.print("Наш читатель\n");
        System.out.println(student.FIO + "\n" + student.number + "\n" +
                student.Facultet + "\n" + student.DateRog + "\n" + student.phone);

        System.out.println();


        student.takeBook(student.FIO, student.a);
        student.takeBook(student.FIO, student.book1, student.book2, student.book3);
        student.returnBook(student.FIO, student.a);
        student.returnBook(student.FIO, student.book1, student.book2, student.book3);



    }

    public static class Reader {
        public String FIO;
        public int number;
        public String Facultet;
        public String DateRog;
        public int phone;
        public int a;
        public String  book1;
        public String  book2;
        public String  book3;

        public void takeBook(String FIO, int a) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Сколько взял книг читатель: ");
            a = sc.nextInt();
            System.out.print("\n" + FIO + " взял " + a + " книг\n");
        }

        public void takeBook(String FIO, String book1, String book2, String book3) {
            Book library = new Book();
            Scanner sc = new Scanner(System.in);
            System.out.print("Какие книги взял читатель\n");
            System.out.print(FIO + " взял книгу: ");
            book1 = sc.nextLine();
            System.out.print("\n" + FIO + " взял книгу: ");
            book2 = sc.nextLine();
            System.out.print("\n" + FIO + " взял книгу: ");
            book3 = sc.nextLine();
            System.out.print("\n" + FIO + " взял книги: " + book1 + ", " + book2 + ", " + book3 +"\n");
            library.Kniga(library.Name, library.Author);
            System.out.print("\n" + FIO + " взял книги: " + book1 + "(" + library.Name + " " + library.Author + "), "
                    + book2 + "(" + library.Name + " " + library.Author + "), " + book3 +
                    "(" + library.Name + " " + library.Author + "),");
        }

        public void returnBook (String FIO, int a){
            Scanner sc = new Scanner(System.in);
            System.out.print("Сколько вернул книг читатель: ");
            a = sc.nextInt();
            System.out.print("\n" + FIO + " вернул " + a + " книг\n");
        }

        public void returnBook (String FIO, String book1, String book2, String book3) {
            Book library = new Book();
            Scanner sc = new Scanner(System.in);
            System.out.print("Какие книги вернул читатель\n");
            System.out.print(FIO + " вернул книгу: ");
            book1 = sc.nextLine();
            System.out.print("\n" + FIO + " вернул книгу: ");
            book2 = sc.nextLine();
            System.out.print("\n" + FIO + " вернул книгу: ");
            book3 = sc.nextLine();
            System.out.print("\n" + FIO + " вернул книги: " + book1 + ", " + book2 + ", " + book3 +"\n");
            library.Kniga(library.Name, library.Author);
            System.out.print("\n" + FIO + " вернул книги: " + book1 + "(" + library.Name + " " + library.Author + "), "
                    + book2 + "(" + library.Name + " " + library.Author + "), " + book3 +
                    "(" + library.Name + " " + library.Author + "),");
        }

    }

    public static class Book {
        public String Name;
        public String Author;

        public void Kniga (String Name, String Author) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Название книги: ");
            Name = sc.nextLine();
            System.out.print("\nАвтор книги: ");
            Author = sc.nextLine();
        }

    }

    static int getNum() {
        Scanner num = new Scanner(System.in);
        return num.nextInt();
    }

    static String getStr() {
        Scanner str = new Scanner(System.in);
        return str.nextLine();
    }
}