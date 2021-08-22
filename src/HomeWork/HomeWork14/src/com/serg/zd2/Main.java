package HomeWork.HomeWork14.src.com.serg.zd2;

public class Main {

    public static void main(String[] args) {
        int[] Massiv = new int[20];
        for(int i = 0; i < Massiv.length; i++){
            Massiv[i] = staticMethod(0, 20);
            System.out.print(Massiv[i]+", ");
        }
    }

    public static int staticMethod(int a, int b){
        if(a > b){
            return (int)(Math.random()*(a - b));
        }
        else{
            return (int)(Math.random()*(b - a));
        }
    }
}
