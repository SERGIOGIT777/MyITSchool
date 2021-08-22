package Lesson.Student1.src.com.serg;
import java.util.Scanner; //Импорт сканера

public class Main {

    public static void main(String[] args) {
        //------------------ЗАНЯТИЕ № 2-------------------


        //----------------Сканер-------------------------



     //   System.out.println("Введите два целых числа");
//        Scanner scan = new Scanner(System.in); //Объявление сканера
     //   int number = scan.nextInt(); //Считывание числа с консоли
     //   int number2 = scan.nextInt();
     //   System.out.println("Вы ввели числа: " + number + " " + number2);
     //   System.out.print("Сумма этих чисел равна = ");
     //  System.out.println(number + number2);

 //       System.out.println("Введите любую фразу  ");
 //       Scanner scan = new Scanner(System.in);
//        String phraze = scan.nextLine();
//        String phraze2 = scan.nextLine();
 //       System.out.print(phraze + " " + phraze2);

//          System.out.println("Введите любую фразу  ");
//          Scanner scan = new Scanner(System.in);
//          String phraze = scan.next();
//          System.out.print(phraze);

//            System.out.println("Введите дробное число");
//            Scanner scan = new Scanner(System.in);
//            double number = scan.nextDouble();
//            System.out.println("Вы ввели число = " + number);



        //------------------------Конкатенация строк------------------------------

//        String name = "Nick";
//        String car = "Scoda";
//        System.out.println(name + " boss buy " + car);

        //-------------------------КОНСТАНТЫ--------------------------------------

//        final double PI = 3.14;
//        double lenth = 2 * PI * 15;
//        double lenth1 = 2 * PI * 25;
//        System.out.println("Периметр круга при радиусе 15 = " + lenth + ", а при радиусе 25 = " + lenth1);

        //--------------------------Операторы if/Switch-----------------------------

//        System.out.println("Введите число 1: ");
//        Scanner scan = new Scanner(System.in);
//        int number = scan.nextInt();
//        if (number == 1) {
//            System.out.println("Вы ввели число 1");
//        }

//        System.out.println("Введите числа и сравните их");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("a1 = ");
//        int a1 = sc.nextInt();
 //       System.out.print("a2 = ");
//        int a2 = sc.nextInt();
 //       if ((a1 > 100) && (a2 > 100)) {
//            a1 = a1 + 10;
//            System.out.println("YES");
//        } else  {
//        System.out.println("NO");
 //       }
//        if (a1 > a2) {
//            System.out.println("YES");
 //       } else {
 //           a1 = a1^a2;
//            a2 = a1^a2;
//            System.out.println("Первое число = " + a2);
//            a1 = a1^a2;
 //           a2 = a1^a2;
//            System.out.println("Второе число = " + a1);

 //       }
/*
        System.out.println("Введите день недели цифрой");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Нет такого дня!!!");
        }
        switch (number) {
            case 1:

            case 2:

            case 3:

            case 4:

            case 5:
                System.out.println("Будний день");
                break;
            case 6:

            case 7:
                System.out.println("Выходной день");
                break;
        }

 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое целое число: ");
        System.out.print("Первое число = ");
        int number1 =sc.nextInt();
        System.out.print("Второе число = ");
        int number2 =sc.nextInt();
        System.out.print("Третье число = ");
        int number3 =sc.nextInt();
        System.out.print("Четвертое число = ");
        int number4 =sc.nextInt();
        System.out.println("___________________________");
        if ((number1 % 2 == 0) && (number2 % 2 == 0) && (number3 % 2 == 0) && (number4% 2 == 0)){
            System.out.println("Все числа четные");
        }  else {
            System.out.println("Одно из чисел нечетное");
        }
            if ((number1 > number2) && (number1 > number3) && (number1 > number4)) {
            System.out.println("Большее четное число = " + number1);
        } else if ((number2 > number1) && (number2 > number3) && (number2 > number4)) {
            System.out.println("Большее четное число = " + number2);
        } else if ((number3 > number1) && (number3 > number2) && (number3 > number4)) {
            System.out.println("Большее четное число = " + number3);
        } else if ((number4 > number1) && (number4 > number2) && (number4 > number3)) {
            System.out.println("Большее четное число = " + number4);
        }

    }
}
