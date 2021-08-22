package HomeWork.HomeWork18.src.com.serg.zd3;

import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        HashSet<int[]> sets = create();
        info(sets);
    }

    public static HashSet<int[]> create()
    {
        int[] massList = {5, 2 ,4, 7, 3};
        HashSet<int[]> list = new HashSet<>();

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

    public static void info(HashSet<int[]> sets)
    {
        for (int[] array: sets )
        {
            for (int x: array)
            {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

}
