package HomeWork.HomeWork27.src.com.serg.zd3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

        public static void main(String[] args) throws Exception
        {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String[] array = new String[20];
            for (int i = 0; i < array.length; i++)
            {
                array[i] = reader.readLine();
            }

            sort(array);

            for (String x : array)
            {
                System.out.println(x);
            }
        }

        public static void sort(String[] array)
        {
            for (int i = 0; i < array.length-1; i++){
                for (int k = i+1; k < array.length; k++){
                    if (isGreaterThan(array[i], array[k])){
                        String str = array[i];
                        array[i] = array[k];
                        array[k] = str;
                    }
                }
            }
        }

        //Метод для сравнения строк: 'а' больше чем 'b'
        public static boolean isGreaterThan(String a, String b)
        {
            return a.compareTo(b) > 0;
        }

}
