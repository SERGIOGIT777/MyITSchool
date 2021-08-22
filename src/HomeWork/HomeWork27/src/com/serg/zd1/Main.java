package HomeWork.HomeWork27.src.com.serg.zd1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < 30; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println("Десятое минимальное - " + array[10]);
        System.out.println("Одинадцатое минимальное - " + array[11]);
    }

    public static void sort(int[] array)
    {
        for (int i = 0; i < array.length ; i++) {
        for (int k = 0; k < array.length ; k++) {
            if (array[i]<array[k]) {
                int min = array[k];
                array[k] = array[i];
                array[i] = min;

            }
        }
    }
    }
}
