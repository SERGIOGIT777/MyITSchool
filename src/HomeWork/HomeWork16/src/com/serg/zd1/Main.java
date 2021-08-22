package HomeWork.HomeWork16.src.com.serg.zd1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<int[]> list = create();
        info(list);
    }

    public static ArrayList<int[]> create()
    {
        int[] massList = {5, 2 ,4, 7, 0};
        ArrayList<int[]> list = new ArrayList<>();

        try {
            for (int value : massList) {
                int[] mass = new int[value];
                for (int j = 0; j < value; j++) {
                    mass[j] = (int) (Math.random() * 9);
                }
                list.add(mass);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return list;

    }

    public static void info(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

}
