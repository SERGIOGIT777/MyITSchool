package Lesson.Student24.src.com.serg.zd5;


import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
       /*String str = Math.random() > 0.5 ? "I'm felling bad" : null;

        Stream.ofNullable(str)
                .forEach(System.out :: println);

        */

        /*Stream.generate(()->6)
                .limit(6)
                .forEach(System.out::println);

         */

        /*Stream.iterate(2, x->x+6)
                .limit(6)
                .forEach(System.out::println);

         */

       /* Stream.iterate(2, x->x<25, x->x+6)
                .forEach(System.out::println);

        */

        /*Stream.concat(Stream.of(1,2,3), Stream.of(4,5,6))
                .forEach(System.out::print);

         */

        /*IntStream.range(0,10)
                .forEach(System.out::println);
        LongStream.rangeClosed(-8l,-5l)
                .forEach(System.out::println);

         */
        Stream.Builder<Integer> streamBuilder = Stream.<Integer>builder()
                .add(0)
                .add(1);
        for(int i = 0; i<=8; i+=2){
            streamBuilder.accept(i);
        }
        streamBuilder
                .add(9)
                .add(10)
                .build()
                .forEach(System.out::println);
    }
}
