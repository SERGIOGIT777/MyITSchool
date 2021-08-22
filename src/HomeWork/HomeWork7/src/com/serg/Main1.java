package HomeWork.HomeWork7.src.com.serg;

import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        int[] numbers = {167, -2, 16, 99, 26, 92, 43, -234, 35, 80};
        System.out.print(Arrays.toString(numbers));
        System.out.print("\nОтсортированный массив: ");

        for (int i = numbers.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int tmp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = tmp;
                }
            }
            System.out.print(numbers[i] + " ");
        }
        System.out.print("\nОтсортированный массив (сортировкой): ");
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
