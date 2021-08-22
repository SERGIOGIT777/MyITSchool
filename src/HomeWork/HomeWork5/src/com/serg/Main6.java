package HomeWork.HomeWork5.src.com.serg;

public class Main6 {
    public static void main(String[] args) {
        var bil = 0;
        var bil1 = 0;
        for (float i = 100000; i <= 999999; i++) {
            var a = Math.round(i/100000);
            var b = Math.round((i%100000)/10000);
            var c = Math.round((i%10000)/1000);
            var d = Math.round((i%1000)/100);
            var e = Math.round((i%100)/10);
            var f = Math.round(i%10);
            var g = a+b+c+d+e+f;
            var a1 = Math.round((i+1)/100000);
            var b1 = Math.round(((i+1)%100000)/10000);
            var c1 = Math.round(((i+1)%10000)/1000);
            var d1 = Math.round(((i+1)%1000)/100);
            var e1 = Math.round(((i+1)%100)/10);
            var f1 = Math.round((i+1)%10);
            var g1 = a1+b1+c1+d1+e1+f1;
            if (g%13 == 0 && g1%13 == 0) {
                bil = (int) i;
                bil1 = (int) (i+1);
                System.out.println("Билет " +bil + " и билет " + bil1 + " несчастливые");
            }
        }
    }
}
