package HomeWork.HomeWork6.src.com.serg;

public class Main6 {
    public static void main(String[] args) {
        //генерация массива в случае если сумма числа и его индекса четная
        int[]mass = new int[]{10,23,34,45,56,75};
        int a = 0;
        for (int i = 0; i < mass.length; i++) {
            if ((mass[i] + i) % 2 == 0) ++a;
        }
        if (a==6) System.out.println("Правило соблюдается");
        else System.out.println("Правило не соблюдается");

    }
}
