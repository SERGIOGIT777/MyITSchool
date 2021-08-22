package Lesson.Student8.src.com.serg;

public class Main3 {
    public static void main(String[] args) {
        sum(1,2,3);
        sum(1,2,3,4,5,6);
        sum();
    }

    static void sum (int ...nums){  // массив чисел
        int result = 0;
        for (int n:nums) {
            result += n;
        }
            System.out.println(result);
    }
}
