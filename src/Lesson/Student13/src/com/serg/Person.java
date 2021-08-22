package Lesson.Student13.src.com.serg;

public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    //позволяет выводить значение в строковый тип
    @Override
    public String toString() {
        return "Person " + name;
    }

    //позволяет получить числа и их сравнить
    @Override
    public int hashCode(){
        return 10 * name.hashCode() + 20456;
    }

    //позволяет осуществить сравнение классов и объектов
    @Override
    public boolean equals(Object ob) {
        if(!(ob instanceof Person)){
            return false;
        }
        Person p = (Person) ob;
        return this.name.equals(p.name);
    }


}
