package HomeWork.HomeWork5.src.com.serg;

public class Main2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 150; i++) {
            boolean massiv = true;
            for(int j = 2; j < i; j++) {
                if (i%j == 0) {
                    massiv = false;
                    break;
                }
            }
            if(massiv && i > 10)
                System.out.print(i + " ");
        }
    }
}
