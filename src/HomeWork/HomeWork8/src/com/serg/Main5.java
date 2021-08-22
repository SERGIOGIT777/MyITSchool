package HomeWork.HomeWork8.src.com.serg;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        System.out.print("В одном рулоне - " + rulon() + " счастливых билетов");
    }

    static int rulon() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите от какого номера начать отсчет счастливых билетов\n");
        System.out.print("От = ");
        int a = sc.nextInt();
        System.out.print("\n");
        int sum=0;
        for(int i=a;i<1000000;i++){
            int i1=i/100000%10;
            int i2=i/10000%10;
            int i3=i/1000%10;
            int i4=i/100%10;
            int i5=i/10%10;
            int i6=i%10;
            if((i1+i2+i3)==(i4+i5+i6)){
                sum++;
            }
        }
        return sum;
    }
}
