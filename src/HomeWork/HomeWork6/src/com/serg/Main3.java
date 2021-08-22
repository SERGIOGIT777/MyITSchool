package HomeWork.HomeWork6.src.com.serg;

public class Main3 {
    public static void main(String[] args) {
        var mass = new int [15];
        int a = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int)(Math.random() * 4) ;
            if(mass[i] == 0 && a < 5){
                mass[i] = 1;
                continue;
            }
            a=a+mass[i];
        }
        for (int value : mass) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
