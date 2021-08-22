package Lesson.Student9.src.com.serg;

public class Main {

   /* public static void main(String[] args) {
       System.out.println(Car.myStatic);
      // System.out.println(Car.notStatic);
    }
}

 class Car {
    int notStatic = 0;
    static int myStatic = 10;
}

    */
   /*public static void main(String[] args) {
        Car.myStatic +=25;
        System.out.println(Car.myStatic);
       //Car car1 = new Car();
       //System.out.println("Статическая переменная объекта car1 = " + car1.myStatic);
       //System.out.println("Статическая переменная объекта car1 = " + car1.notStatic);
        Car car2 = new Car();
        System.out.println("Статическая переменная объекта car2 = " + car2.myStatic);
        car2.notStatic +=20;
        System.out.println("Статическая переменная объекта car2 = " + car2.notStatic);

        Car car3 = new Car();
        System.out.println("Статическая переменная объекта car3 = " + car3.myStatic);
        System.out.println("Статическая переменная объекта car3 = " + car3.notStatic);
   }

}

class Car {
    int notStatic = 0; // требует постоянного переопределения
    static int myStatic = 10;
}

    */

    public static void main(String[] args) {
       // myClass mc1 = new myClass();
       // mc1.firstMethod();
       // mc1.secondMethod();
        myClass.firstMethod();
        //myClass.secondMethod();
    }
}

    class myClass{
        public static void firstMethod() {
            System.out.println("Это статический метод");
        }
        public void secondMethod() {
            System.out.println("Это не статический метод");
        }
    }
