package Lesson.Student26.src.com.serg.zd3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alex", Speciality.Physics, 1),
                new Student("Rika", Speciality.Biology, 4),
                new Student("Julia", Speciality.Biology, 2),
                new Student("Steve", Speciality.History, 4),
                new Student("Mike", Speciality.Finance, 1),
                new Student("Hinata", Speciality.Biology, 2),
                new Student("Richard", Speciality.History, 1),
                new Student("Kate", Speciality.Psychology, 2),
                new Student("Sergey", Speciality.ComputerScience, 4),
                new Student("Maximilian", Speciality.ComputerScience, 3),
                new Student("Tim", Speciality.ComputerScience, 5),
                new Student("Ann", Speciality.Psychology, 1)
        );

        students.stream()
                .collect(Collectors.groupingBy(Student::getNumber))
                .entrySet().forEach(System.out::println);
    }
}

class Student {
    String name;
    int number;
    Speciality sp;

    public Student(String name, Speciality sp, int number){
        this.name = name;
        this.number = number;
        this.sp = sp;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNumber(){
        return number;
    }

    public Speciality sp(){
        return sp;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void setSp(Speciality sp){
        this.sp = sp;
    }

    @Override
    public String toString(){
        return "Имя студента: " + name +
                ", факультет " + sp + ", курс " + number;
    }

}

enum Speciality {
    Biology, ComputerScience, Economics, Finance,
    History, Philosophy, Physics, Psychology
}
