package Lesson.Student21.src.com.serg.zd1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	/*StringBuffer sb = new StringBuffer();
	sb.append(new Integer(2))
            .append("; ")
            .append(false)
            .append("; ")
            .append(Arrays.asList(1, 2, 3))
            .append("; ");
     System.out.println(sb);*/

       /* String numbers = "123456789";
        StringBuffer sb = new StringBuffer(numbers);

        System.out.println(sb.substring(4));
        System.out.println(sb.substring(5, 9));

        System.out.println();

        System.out.println(sb.replace(3, 5, "ABCDEF"));

        System.out.println();

        sb = new StringBuffer(numbers);
        System.out.println(sb.reverse());
        System.out.println();
        System.out.println(sb.reverse());

        System.out.println();
        sb = new StringBuffer(numbers);

        System.out.println(sb.delete(5, 9));

        System.out.println();

        System.out.println(sb.deleteCharAt(1));

        System.out.println();

        System.out.println(sb.insert(1, "One"));


        */

        String numbers = "123456789";
        StringBuilder sb = new StringBuilder(numbers);

        System.out.println(sb.substring(4));
        System.out.println(sb.substring(5, 9));

        System.out.println();

        System.out.println(sb.replace(3, 5, "ABCDEF"));

        System.out.println();

        sb = new StringBuilder(numbers);
        System.out.println(sb.reverse());
        System.out.println();
        System.out.println(sb.reverse());

        System.out.println();
        sb = new StringBuilder(numbers);

        System.out.println(sb.delete(5, 9));

        System.out.println();

        System.out.println(sb.deleteCharAt(1));

        System.out.println();

        System.out.println(sb.insert(1, "One"));
    }
}
