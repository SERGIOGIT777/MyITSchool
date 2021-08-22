package HomeWork.HomeWork26.src.com.serg.zd1;

import java.util.*;
import java.util.stream.Collector;
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

        System.out.println("Группировка студентов по курсу stream");
        students.stream()
                .collect(Collectors.groupingBy(Student::getNumber))
                .entrySet()
                .forEach(System.out::println);

        System.out.println("\nСписок специальностей в алфавитном порядке");
        students.stream()
                .map(Student::sp)
                .distinct()
                .sorted(Comparator.comparing(Enum::name))
                .forEach(System.out::println);

        System.out.println("\nКоличество учащихся на каждой из специальностей");
        students.stream()
                .collect(Collectors.groupingBy(Student::sp, Collectors.counting()))
                .forEach((spes, numS)->System.out.println(spes + " - " + numS));

        System.out.println("\nТаблица студентов по специальности и курсу");
        Map<Speciality, Map<Integer, List<Student>>> statistic = students.stream()
                .sorted(Comparator.comparing(Student::sp,
                        Comparator.comparing(Enum::name))
                .thenComparing(Student::getNumber))
                .collect(Collectors.groupingBy(Student::sp,
                LinkedHashMap::new,
                        Collectors.groupingBy(Student::getNumber)));
        statistic.forEach((spec, map) -> {
            System.out.println(spec);
            map.forEach((kurs, list) -> System.out.format("%d: %s%n",
                    kurs,
                    list.stream()
                            .map(Student::getName)
                            .sorted()
                            .collect(Collectors.joining(", "))));
            System.out.println();
        });

        System.out.println("Студенты 3-го курса, кроме Физики и CS:");
        students.stream()
                .filter(s -> !EnumSet.of(Speciality.ComputerScience, Speciality.Physics)
                        .contains(s.sp()))
                .anyMatch(s -> s.getNumber() == 3);


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
                ", факультет: " + sp + ", курс: " + number;
    }

}

enum Speciality {
    Biology,
    ComputerScience,
    Economics,
    Finance,
    History,
    Philosophy,
    Physics,
    Psychology
}
