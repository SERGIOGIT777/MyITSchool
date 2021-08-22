package Lesson.Student24.src.com.serg.zd1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> list = Arrays.stream(args)
                .filter(s->s.length()<=2)
                .collect(Collectors.toList());


        IntStream.of(120, 140, 43, 93, 23, 314, 549)
                .filter(x->x <300)
                .map(x->x + 11)
                .limit(3)
                .forEach(System.out::print);

        /*Stream<String> stream = list.stream();
        stream.forEach(System.out::print);
        stream.filter(s->s.contains("Stream API"));
        stream.forEach(System.out::print);*/
    }
}
