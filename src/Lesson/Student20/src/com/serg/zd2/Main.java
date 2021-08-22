package Lesson.Student20.src.com.serg.zd2;

import java.util.Arrays;

public class Main {

        private static String[] array = {"Для", "работы", "со", "строками", "в", "языке", "Java",
                "используется", "метод", "compateTo"};

    public static void main(String[] args) {
	/*String str1 = "Hellow";
	String str2 = "Good-By";
	String str3 = "HELLOW";
	String str4 = "Hellow";

	System.out.println(str1 + "equals " + str4 + " -> " + str1.equals(str4));
	System.out.println(str1 + "equals " + str2 + " -> " + str1.equals(str2));
	System.out.println(str1 + "equals " + str3 + " -> " + str1.equals(str3));
	System.out.println(str1 + "equals " + str3 + " -> " + str1.equalsIgnoreCase(str3));

	 */
        /*String str1 = "Java";
        String str2 = "Java";

        String str3 = new String("Java");
        String str4 = new String(str1);

        System.out.println("s1 == s2 : " + (str1 == str2));
        System.out.println("s3 == s4 : " + (str3 == str4));
        System.out.println("s1 == s3 : " + (str1 == str3));
        System.out.println("s1 equals s2 : " + (str1.equals(str2)));
        System.out.println("s1 equals s3 : " + (str1.equals(str3)));

         */
        /*System.out.println("Footbal".endsWith("bal"));
        System.out.println("Footbal".endsWith("ball"));
        System.out.println();
        System.out.println("Footbal".startsWith("Foot"));
        System.out.println("Footbal".startsWith("foot"));
        System.out.println();
        System.out.println("Footbal".contains("ot"));
        System.out.println();
        System.out.println("Hello word!!".regionMatches(6,"word",8, 3));

         */

        //Сортировка пузырьком

        for(int j = 0; j<array.length; j++){
            for(int i = j+1; i<array.length; i++){
                if(array[i].compareTo(array[j])<0){
                    String t = array[j];
                    array[j] = array[i];
                    array[i] = t;
                }
            }
        }
        System.out.println(Arrays.toString(array));


    }

}


