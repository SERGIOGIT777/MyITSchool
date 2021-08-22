package Lesson.Student5.src.com.serg;

public class Main3 {
    public static void main(String[] args) {
        //------------------------Метод toCharArray------------
        /*String str = "Hello";
        char[] result = str.toCharArray();

        System.out.println("Char array:");
        for (int i = 0; i < result.length; i++) {
            System.out.println("Element [" + i + "]: " + result[i]);
        }
         */

        //---------------------CopyValueOf---------------------

        /*char[] chars = {'H', 'E', 'L', 'L', 'O'};
        String str = "String";
        System.out.println("String str before copyValueOf: " + str);

        str = str.copyValueOf(chars);
        System.out.println("String str after copyValueOf: " + str);

         */
        /*char[] chars = {'H', 'E', 'L', 'L', 'O'};
        String str = str.copyValueOf(chars); // не инициализированна строка str
        System.out.println("Returned string: " + str);

         */
/*
        char[] chars = {'H', 'E', 'L', 'L', 'O'};
        String str = "String";
        String str2 = str.copyValueOf(chars);
        System.out.println("String str1 before copyValueOf: " + str);
        System.out.println("String str1 after copyValueOf: " + str2);

 */
        /*
        char[] chars = {'H', 'E', 'L', 'L', 'O'};
        String str1 = "String";
        String str2 = str1.copyValueOf(chars);
        String str3 = str1.copyValueOf(chars, 1, 3); //вырезает из строки по индексу от 1  до 3
        System.out.println("String wisout parameters: " + str2);
        System.out.println("String with parameters: " + str3);

         */

        //------------------------indexOf----------------------

        /*String str = "HELLO";
        int index = str.indexOf('H');
        int index1 = str.indexOf('O');
        int index2 = str.indexOf('W');
        System.out.println("Мы ищем букву 'H' в строке " + str + " индекс данной буквы " + index);
        System.out.println("Мы ищем букву 'O' в строке " + str + " индекс данной буквы " + index1);
        System.out.println("Мы ищем букву 'W' в строке " + str + " индекс данной буквы " + index2);

         */

        /*String str = "HELLO";
        int index1 = str.indexOf('H', 2);
        int index2 = str.indexOf('O', 2);
        int index3 = str.indexOf('W',2);

        System.out.println("Мы ищем букву 'H' в строке " + str + " начиная с индекса 2 - номер индекса " + index1);
        System.out.println("Мы ищем букву 'O' в строке " + str + " начиная с индекса 2 - номер индекса " + index2);
        System.out.println("Мы ищем букву 'W' в строке " + str + " начиная с индекса 2 - номер индекса " + index3);
         */
        /*String str = "Good morning";
        int index1 = str.indexOf("morning");
        int index2 = str.indexOf("Good");
        int index3 = str.indexOf("night");
        int index4 = str.indexOf("Good morning",-2);
        int index5 = str.indexOf("Good morning",2);
        int index6 = str.indexOf("Good morning",99);

        System.out.println("Поиск 'morning' в строке " + str + " Индекс - " + index1);
        System.out.println("Поиск 'Goodg' в строке " + str + " Индекс - " + index2);
        System.out.println("Поиск 'night' в строке " + str + " Индекс - " + index3);
        System.out.println("Поиск 'Good morning' в строке " + str + " Начиная с индекса -2 Индекс - " + index4);
        System.out.println("Поиск 'Good morning' в строке " + str + " Начиная с индекса 2 Индекс - " + index5);
        System.out.println("Поиск 'Good morning' в строке " + str + " Начиная с индекса 99 Индекс - " + index6);

         */

        //---------------------------------replace---------------------------

        /*String oldString = "ABC";
        String newString = oldString.replace('A', 'D');

        System.out.println("OLDSTRING = " + oldString);
        System.out.println("NEWSTRING = " + newString);

         */

        /*String oldString = "Java";
        String newString = oldString.replace('a', 'i');

        System.out.println("OLDSTRING = " + oldString);
        System.out.println("NEWSTRING = " + newString);
         */

        /*String oldString = "Java";
        String newString = oldString.replace("Java", "AVAFF");

        System.out.println("OLDSTRING = " + oldString);
        System.out.println("NEWSTRING = " + newString);

         */
        /*String [][] mass1 = new String [][]{
                {"День рождения", "Месяц рождения"},
                {"Год рождения", "Возраст"}
        };
        for (int i=0; i < mass1.length; i++) {
            for (int j =0; j < mass1[i].length; j++){
                System.out.print(mass1[i][j] + " ");
            }
            System.out.println();
        }

         */
       /*int [][] mass1 = new int [][]{
                {10, 07},
                {1988, 29}
        };
        for (int i=0; i < mass1.length; i++) {
            for (int j =0; j < mass1[i].length; j++){
                System.out.print(mass1[i][j] + " ");
            }
            System.out.println();
        }

        */
        /*int [] mass = new int [15];
        int a = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int)(Math.random()*2);
            if (mass[i] == 1 && a!=2) {
                a = mass[i] + a;
                System.out.print(mass[i] + " ");
                continue;
            }
            if (a == 2) mass[i] = 0;
            System.out.print(mass[i] + " ");
        }

         */
        int [] mass = new int [15];
        int a = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (Math.random() * 2);
            System.out.print(mass[i] + " ");
        }



    }
}
