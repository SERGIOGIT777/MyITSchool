package Lesson.Student14.src.com.serg.zd2;

public class Book {
    String name;
    Type bookType;
    String author;

    public Book(String name, String author, Type type){

        bookType = type;
        this.name = name;
        this.author = author;
    }
}
enum Type
{
    SCIENCE,
    BELLETRE,
    PHANTASY,
    SCIENCE_FICTION
}

