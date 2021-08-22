package HomeWork.HomeWork18.src.com.serg.zd1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> hash = new HashMap<>();
        while (true) {
            System.out.println("Введите число = ");
            String text = sc.nextLine();
            if (text.isEmpty()) {
                showMap(hash);
            }
            try {
                Integer id = Integer.parseInt(text);
                System.out.println("Введите строку = ");
                String name = sc.nextLine();
                if (name.isEmpty()) {
                    break;
                }

                hash.put(id, name);
            } catch (NumberFormatException e) {
                showMap(hash);
                break;
            }
            showMap(hash);
        }
    }

    private static void showMap(HashMap<Integer, String> hash) {
        if (!hash.isEmpty()) {
            for (Map.Entry<Integer, String> pair : hash.entrySet()) {
                System.out.println(pair.getKey() + ":" + pair.getValue());
            }
        }
    }
}
