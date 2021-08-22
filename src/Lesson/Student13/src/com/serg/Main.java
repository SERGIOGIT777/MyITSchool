package Lesson.Student13.src.com.serg;

public class Main {

    public static void main(String[] args) {
	    /*Dancer dancer = new Dancer("Tom", 12);
	    Dancer breakDancer = new BreakDancer("Jonny", 25); //восходящее преобразование к базовому классу
	    Dancer hipHopDancer = new HelperDancer("Maks", 21); //восходящее преобразование к базовому классу
*/
        /*Person tom = new Person("Tom");
        System.out.println(tom.toString()); // Будет выводить что-то наподобие Person@7960847b
        System.out.println(tom.hashCode()); //позволяет в последующем сравнивать строки и объекты
        System.out.println(tom.getClass());
        Person cris = new Person("Cris");
        System.out.println(tom.equals(cris));
        Person tom2 = new Person("Tom");
        System.out.println(tom.equals(tom2));

         */

       // Book b1 = new Book("Java. Complete Referense.", "H. Shildt");
        //Определение классов через интерфесы
       /* Printable b1 = new Book("Java. Complete Referense.", "H. Shildt");
        b1.print();
        b1 = new Jurnal("Foreign Policy");
        b1.print();
        */

        //Интерфейс не имеет метода getName, необходимо приведение явное
        /*String name = ((Jurnal)b1).getName();
        System.out.print(name);
         */

       // Printable.read();
        /*Calculation c = new Calculatable();
        System.out.println(c.sum(1,2));
        System.out.println(c.sum(1,2,4));

         */

        /*WaterPipe pipe = new WaterPipe();
        pipe.printState(3);

         */
       /* Printable printable = createPrintable("Foreign Affairs",false);
        printable.print();

        read(new Book("Java for impatients", "Cay Horstmann"));
        read(new Jurnal("Java Dayly News"));
    }

    static void read(Printable p){

        p.print();
    }
    static Printable createPrintable(String name, boolean option){

        if(option)
            return new Book(name, "Undefined");
        else
            return new Jurnal(name);

        */
        double temperature = 23.5;
        System.out.println("Цельсия t = " +
                new BaseConverter().getConvertedValue(temperature));
        System.out.println("Кельвина t = " +
                new BaseConventer1().getConvertedValue(temperature));
        System.out.println("Фаренгейта t = " +
                new BaseConventer2().getConvertedValue(temperature));
    }
}
