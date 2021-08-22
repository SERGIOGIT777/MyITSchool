package HomeWork.HomeWork21.src.com.serg.zd1;

public class Main {

    public static void main(String[] args) {
	StringBuilder str1 = new StringBuilder("string");
	StringBuilder str2 = new StringBuilder("code");
	StringBuilder str3 = new StringBuilder("Practice");

	System.out.println("Средняя подстрока строки str1 = " + str1.substring(str1.length()/2-1, str1.length()/2+1));
	System.out.println("Средняя подстрока строки str2 = " + str2.substring(str2.length()/2-1, str2.length()/2+1));
	System.out.println("Средняя подстрока строки str3 = " + str3.substring(str3.length()/2-1, str3.length()/2+1));
    }
}
