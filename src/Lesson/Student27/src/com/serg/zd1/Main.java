package Lesson.Student27.src.com.serg.zd1;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        /*PrintStream outStream = new PrintStream(System.out);
        PrintStream errStream = new PrintStream(System.err);

        outStream.println("Hello Word!");
        errStream.println("Some error");*/

        /*char c;
        InputStreamReader sr = new InputStreamReader(System.in);
        System.out.println("Введите символы, '.' - для выхода: ");
        do{
            c = (char)sr.read();
            System.out.println(c);
        } while (c != '.');*/

       /* char err[] = new char[10];
        //ПОток ввода (консоль)
        InputStreamReader sr = new InputStreamReader(System.in);
        int count; // количество прочитаных символов

        //Прочитать 4 символа из консоли
        //Запись символов в массив err, начиная с позиции 0
        System.out.println("Введите символы (максимум 10): ");

        count = sr.read(err, 0,4);
        System.out.println("Вы ввели " + count + " символы");

        System.out.println("Err after input: ");

        for(int i = 0; i< err.length; i++){
            System.out.println("err[" + i + "] = " + err[i]);
        }*/

       /* char c;
        InputStreamReader sr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(sr);

        System.out.println("Введите симовлы, '.' - для выхода: ");

        do{
            c = (char)br.read();
            System.out.println(c);
        } while (c != '.');*/

      /*  //вывод массива вещественных чисел в консоль
        //1) Создание входных данных - массива вещественных чисел
        //и его заполнение
        double AO[] = new double[5];
        for(int i = 0; i<AO.length;i++){
            AO[i] = i *2.5 +1;
        }

        //2) создание экземпляра класса PrintStream
        PrintStream ps = new PrintStream(System.out);

        //3) вывод массива через метод println()
        ps.println("Массив AO:");

        for(int i = 0; i<AO.length; i++){
            ps.println(AO[i]);
        }*/

       /* //Создание класса чтения строк InputStreamReader
        InputStreamReader sr = new InputStreamReader(System.in);

        //Создение экзепляра класса буферизации
        BufferedReader br = new BufferedReader(sr);

        String s;

        System.out.println("Введите строку: ");
        do{
            s = br.readLine(); //считывание одной строки
            System.out.println(s); //вывод строки на экран
        } while (!s.equals("end")); //пока не будет выведена строка "end"

        */
       /* //1) Объявление экземпляров классов, которые получают данные (строку)
        InputStreamReader sr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(sr);
        //2) Объявление экземпляров классов, вывод строки
        FileOutputStream fos = new FileOutputStream("string.txt");
        PrintStream ps = new PrintStream(fos);

        //3) Создание дополнительной переменной
        String s;
        //4) Цикл ввода строк из консоли и запись их в файл
        System.out.println("Введите сроку: ");

        do{
            s = br.readLine(); //считывание строк
            System.out.println(s);//вывод строк на экран
            ps.println(s);//запись строк в поток -- в файл string.txt
        } while (!s.equals("end"));
*/

      /*  //Прочитать строки из файла в консоль

        FileReader fr = new FileReader("string.txt");
        char buffer[] = new char[1000]; //буфер для чтения

        //Цикл чтения строк из файла

        do {
            fr.read(buffer); //чтение строки в буфер buffer
            System.out.println(buffer);
        } while (fr.ready()); //Проверка, не конец ли файла
*/

  /*      //Направление вывода из строки в файл с именем "output.txt"

        //1. Входные данные

        String s = "www.best.net"; // строка, которую нужно записать в файл

        String filename = "output.txt"; //имя файла, в который записывается строка s

        //2. Создание экземпляра класса FileOutputStream

        FileOutputStream fs = new FileOutputStream(filename);

        //3. Создание экземпляра класса PrintStream, в который необходимо
        // поместить экземпляр FileOutputStream

        PrintStream ps = new PrintStream(fs);

        //4. Запись строки "www.best.net" в файл "output.txt"

        ps.println(s);

*/
        File f1 = new File("output.txt");
        String path1 = f1.getPath();
        System.out.println(path1);

        File f2 = new File("C:\\", "Program Files");
        String path2 = f2.getPath();
        System.out.println(path2);

        File f3 = new File("C:\\Program Files\\Java\\Project");
        File f4 = new File(f3, "output.txt");

        String path3 = f3.getPath();
        String path4 = f4.getPath();

        System.out.println("path3 " + path3);
        System.out.println("path4 " + path4);
    }
}
