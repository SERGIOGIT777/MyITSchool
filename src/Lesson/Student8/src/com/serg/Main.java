package Lesson.Student8.src.com.serg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double num1 = getNumber(); //первый метод
        double num2 = getNumber(); //первый метод

        char operation = getOperation(); //второй метод

        double result = calc(num1, num2, operation); //третий метод

        System.out.print("Результат: " + result);//вывод результата
    }

    //--------Метод получения числа с клавиатуры

    public static double getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число = ");
        if (sc.hasNextDouble()) { // ------- Проверка ввода числа-----
            return sc.nextDouble();
        } else {
            System.out.println("Ошибка при вводе числа. Повторите ввод ");
            return getNumber();
        }
    }

    //--------Метод выполнения операции----------

    public static char getOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите номер операции: \n1. Сложить\n2. Отнять\n3. Умножить\n4. Разделить\n5. Куб числа\n6. Квадрат числа\n7. Степень\n");
        int operationnumber;
        if (sc.hasNextInt()) {
            operationnumber = sc.nextInt();// проверка ввода числа
        } else {
            System.out.println("Вы ввели не число. Повторите ввод: ");
            return getOperation();
        }
        switch (operationnumber) {// проверка ввода операции (число от 1-7)
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            case 5:
                return '^';
            case 6:
                return '!';
            case 7:
                return '%';
            default:
                System.out.println("Неправильная операция! Повторите ввод!");
                return getOperation();
        }
    }

    //----------Метод сложения чисел

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    //----------Метод вычитания чисел

    public static double sub(double num1, double num2) {
        return num1 - num2;
    }

    //----------Метод умножения чисел

    public static double mult(double num1, double num2) {
        return num1 * num2;
    }

    //----------Метод деления чисел

    public static double div(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Делить на 0 нельзя!");
            return Double.NaN;
        }
    }

    public static double cub(double num1) {
        return num1 * num1 * num1;
    }

    public static double kvadr(double num1) {
        return num1 * num1;
    }

    public static double stepn(double num1, double num2) {
        double result = 1;
        for (int i=1; i<=num2; i++){
            result = result*num1;
        }
        return result;
    }

    //--------------Метод расчета (определяет какой метод нужно использовать)-------
    //--------------add, sub, mult, div----------------------

    public static double calc(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return add(num1, num2);
            case '-':
                return sub(num1, num2);
            case '*':
                return mult(num1, num2);
            case '/':
                return div(num1, num2);
            case '^':
                return cub(num1);
            case '!':
                return kvadr(num1);
            case '%':
                return stepn(num1, num2);
            default:
                return Double.NaN;
        }

    }
}
