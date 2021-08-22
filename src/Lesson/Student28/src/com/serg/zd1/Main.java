package Lesson.Student28.src.com.serg.zd1;

import java.io.*;

public class Main {

    private static String text = "This new text\n This new text2\n This new text3";
    private static String nameFile = "C://Programs/a.txt";

    public static void main(String[] args) throws IOException {

    /*	//метод getName()

	    File f = new File("C:\\Program Files\\");
	    String name = f.getName();
	    System.out.println("name = " + name);

	    //метод getPath()
		File f1 = new File("output.txt");
		String name1 = f1.getPath();
		System.out.println("Path = " + name1);

		File f2 = new File("C:\\Program Files\\");
		String name2 = f2.getPath();
		System.out.println("Path2 = " + name2);
		*/
		//метод isAbsolute
		/*
		File f1 = new File("output.txt");
		boolean res1 = f1.isAbsolute();
		System.out.println(res1);

		File f2 = new File("C:\\Program Files\\");
		boolean res2 = f2.isAbsolute();
		System.out.println(res2);

		 */

		//метод getAbsolutePath();

		/*File f1 = new File("output.txt");
		String absPath = f1.getAbsolutePath();
		System.out.println(absPath);

		File f2 = new File("C:\\Program Files\\");
		String absPath2 = f2.getAbsolutePath();
		System.out.println(absPath2); */

		//Методы canRead and canWrite

		/*File f1 = new File("output.txt");

		if(f1.canRead()){
			System.out.println("The result of CanRead is true");
		}
		else{
			System.out.println("The result of CanRead is false");
		}

		File f2 = new File("output.txt");

		if(f2.canWrite()){
			System.out.println("The result of CanWrite is true");
		}
		else{
			System.out.println("The result of CanWrite is false");
		}

		 */

		//метод exists();

		/*File f1 = new File("output.txt");

		if(f1.exists()){
			System.out.println("File is present.");
		} else {
			System.out.println("File is not present");
		}

		File f2 = new File("C:\\Program Files\\");
		if(f2.exists()){
			System.out.println("Directory is present.");
		} else {
			System.out.println("Direstory is not present");
		}

		 */

        //FileOutputStream fos = new FileOutputStream("output.txt");

        //метод isDirectory;

       /* File f1 = new File("C:\\Program Files\\");
        if (f1.exists()) {
            if (f1.isDirectory()) {
                System.out.println("File is Directory true");
            } else {
                System.out.println("File is Directory false");
            }
        }
        else {
            System.out.println("File is not present");
        }
        */
        //метод isFile();

     /*   File f1 = new File("output.txt");
        if (f1.exists()) {
            if (f1.isFile()) {
                System.out.println("File is true");
            } else {
                System.out.println("File is false");
            }
        }
        else {
            System.out.println("File is not present");
        }

        */

        //метод isHidden();

       /* File f1 = new File("output.txt");

        if(f1.isHidden()){
            System.out.println("The file \"output.txt\" is hidden");
        } else {
            System.out.println("The file \"output.txt\" is not hidden");
        }

        */

        //метод length();

       /* File f1 = new File("output.txt");
        //Создание потока, который запишет символы в файл f1
        FileWriter fw = new FileWriter(f1);
        //запись строки "Hello Word!!!"
        fw.write("Hello Word!!!");
        //закрываем файл
        fw.close();

        //определим размер файлы

        long size = f1.length();

        System.out.println("Size = " + size);

        */

     /*   File f1 = new File("output.txt");
        //Создание потока, который запишет символы в файл f1
        FileWriter fw = new FileWriter(f1);
        //запись строки "Hello Word!!!"
        fw.write("Hello Word!!!");
        //закрываем файл
        fw.close();

        //удаление файла

        if(f1.exists()){
            f1.delete();
            System.out.println("File is delete");
        } else {
            System.out.println("Error with file while is delete");
        }

      */

        /*
        //метод mkdir();
        //объявить файловую переменную и связать ее с папкой в текущем каталоге (относительный путь)
        File f = new File("123");

        //если каталог не существует, то создать его

        if(!f.exists()){
            if(f.mkdir()){
                System.out.println("The folder is created"); // создана папка
            } else{
                System.out.println("Error with created folder");
            }
        }
        else {
            System.out.println("The folder is present");
        }

        File f2 = new File("C:\\Programs");

        boolean res = f2.mkdir();

        if(res){
            System.out.println("The folder C:\\Program is created");
        } else{
            System.out.println("The folder C:\\Program is not created ");
        }

         */
      /*  //метод mkdirs();
        File f = new File("C:\\ABC\\DEF\\GHI");
        if(f.mkdirs()){
            System.out.println("The folders is created");
        } else {
            System.out.println("The folder are not created");
        }
        */
       /* File f = new File("output.txt");
        File f2 = new File("output2.txt");

        if(f.exists()){
            if(f.renameTo(f2)){
                System.out.println("OK!!!");
            } else{
                System.out.println("FALSE");
            }
        } else {
            System.out.println("The file is not present");
        }

        */
        /*
        File f = new File("C:\\");
        long totalSpace = f.getTotalSpace();
        System.out.println("TOTAL_SPACE = " + totalSpace);

        File f1 = new File("C:\\");
        long totalFreeSpace = f1.getFreeSpace();
        System.out.println("TOTAL_FREE_SPACE = " + totalFreeSpace);

         */

       /* write(text, nameFile);
 //       read("no_file.txt");
        String textFile = read(nameFile);
        System.out.println(textFile);

        */

        update(nameFile, "This new text");

    }
    public static void write(String text, String nameFile){

        //определяем файл

        File file = new File(nameFile);

        //проверка, что файл не существует
        try{
            if(!file.exists()){
                file.createNewFile();
            }
            //PrintWriter обеспечит возможности записи в файл
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());

            try{
                //записываем текст в файл
                out.print(text);
            }
            finally {
                out.close();
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }

    }
    public static String read(String nameFile) {
        StringBuilder sb = new StringBuilder();
        File file = new File(nameFile);

        try{
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try{
                String s;
                while((s = in.readLine()) != null){
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        return sb.toString();
    }

    private static void exists(String nameFile) throws FileNotFoundException{
        File file = new File(nameFile);
        if (!file.exists()){
            throw new FileNotFoundException(file.getName());
        }
    }

    public static void update(String Filename, String newText) throws FileNotFoundException{
        exists(Filename);
        StringBuilder sb = new StringBuilder();
        String oldFile = read(Filename);
        sb.append(oldFile);
        sb.append(newText);
        write(Filename, sb.toString());
    }
}
