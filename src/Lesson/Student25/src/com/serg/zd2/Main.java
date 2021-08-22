package Lesson.Student25.src.com.serg.zd2;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {
        /*Stream.of(1, 2, 3)
                .filter(x->x == 10)
                .forEach(System.out::print);
        Stream.of(129, 234, 79, 78, 345)
                .filter(x->x>100)
                .forEach(System.out::println);*/

        /*Stream.of("3", "4", "5")
                .map(Integer::parseInt)
                .map(x->x+10)
                .forEach(System.out::println);

        Stream.of(120, 948, 83, 284, 1209)
                .map(x->x+119)
                .map(y->y<500)
                .forEach(System.out::println);*/
        /*Stream.of(2, 5, 2, 6, 8, 1, 5)
                .flatMapToInt(x-> IntStream.range(0,x))
                .forEach(System.out::print);*/
        /*Stream.of(2, 5, 2, 6, 8, 1, 5)
                .limit(3)
                .flatMapToInt(x-> IntStream.range(0,x))
                .forEach(System.out::print);*/
        /*Stream.of(2, 5, 2, 6, 8, 1, 5)
                .skip(5)
                .flatMapToInt(x-> IntStream.range(0,x)) // размерность числа от 0 то x( 5 - 0 1 2 3 4)
                .forEach(System.out::print);*/
        /*IntStream.range(0, 1000)
                .sorted()
                .limit(5)
                .forEach(System.out::println);
        Stream.of(123, 543, 23, 85, 342, 989)
                .sorted()
                .forEach(System.out::println);*/
       /* Stream.of(123, 123, 455, 85, 455, 989)
                .distinct()
                .sorted()
                .forEach(System.out::println);*/
        /*Stream.of(0, 3, 0, 0, 5)
                .peek(x->System.out.format("before dislink: %d%n", x))
                .distinct()
                .peek(x->System.out.format("after dislink: %d%n", x))
                .map(x->x*x)
                .forEach(x->System.out.format("after map: %d%n",x));*/
       /* Stream.of(1, 2, 3, 4, 5, 2, 4, 3)
                .takeWhile(x->x<3)
                .forEach(System.out::println);
        System.out.println();
        Stream.of(1, 2, 3, 4, 5, 2, 4, 3)
                .dropWhile(x->x<3)
                .forEach(System.out::println);*/

       /* DoubleStream.of(0.1, Math.PI)
                .boxed()
                .map(Object::getClass)//показывает к какому классу принадлежит объект
                .forEach(System.out::println);*/

        //ТЕРМИНАЛЬНЫЕ ОПЕРАТОРЫ

        /*Stream.of(1, 2, 3, 4, 5)
                .forEach(x->System.out.format("%s, ", x));*/

      /*  long count = IntStream.range(0, 10)
                .flatMap(x->IntStream.range(0, x))
                .count();
        System.out.print(count);*/

        /*List<Integer> lit =  Stream.of(1, 2, 3)
                            .collect(Collectors.toList());
        System.out.println(lit);
        String s = Stream.of(1, 2 ,3)
                .map(String::valueOf)
                .collect(Collectors.joining("-", "<", ">"));
        System.out.println(s);*/

       /* IntStream.range(0, 100000)
                .parallel()
                .filter(x->x % 1000 == 0)
                .map(x->x / 1000)
                .forEach(System.out::println);
        System.out.println("-----------------------");
        IntStream.range(0, 100000)
                .parallel()
                .filter(x->x % 1000 == 0)
                .map(x->x / 1000)
                .forEachOrdered(System.out::println);*/

       /* List<String> list = Stream.of("a", "b", "c", "d")
                .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
        System.out.println(list);*/

      /*  String[] element = Stream.of("a", "b", "c", "d")
                .toArray(String[]::new);
        System.out.println(Arrays.toString(element));*/
        
        /*int sum = Stream.of(1, 2, 3, 4, 5)
                .reduce(10, (acc,x)->acc+x);
        System.out.println(sum);*/

        /*Optional<Integer> result = Stream.<Integer>empty()
                .reduce((adc,x)->adc +x);
        System.out.println(result);

        System.out.println("---------------");
        Optional<Integer> result1 = Stream.of(1, 2, 3, 4, 5)
                .reduce((adc,x)->adc + x);
        System.out.println(result1);*/

       /* int anySeq = IntStream.range(4, 9384)
                .findAny()
                .getAsInt();
        System.out.println(anySeq);

        System.out.println("----------------");

        int firstSeq = IntStream.range(4, 9384)
                .findFirst()
                .getAsInt();
        System.out.println(firstSeq);

        System.out.println("---------------");

        int anyParallel = IntStream.range(4, 9384)
                .parallel()
                .findAny()
                .getAsInt();
        System.out.println(anyParallel);

        System.out.println("----------------");

        int firstParallel = IntStream.range(4, 9384)
                .parallel()
                .findFirst()
                .getAsInt();
        System.out.println(firstParallel);*/

       /* boolean result = Stream.of(1, 2, 3, 4, 5)
                .allMatch(x->x <=7);
        System.out.println(result);

        System.out.println("-------------------");

        boolean result1 = Stream.of(1, 2, 3, 4, 5)
                .allMatch(x->x<3);
        System.out.println(result1);

        boolean result2 = Stream.of(1, 2, 3, 4, 5)
                .anyMatch(x->x <=7);
        System.out.println(result2);

        System.out.println("-------------------");

        boolean result3 = Stream.of(1, 2, 3, 4, 5)
                .anyMatch(x->x<3);
        System.out.println(result3);*/

       /*boolean result = Stream.of(1, 2, 3, 4, 5)
                .anyMatch(x->x==6);
        System.out.println(result);*/

        /*double result = IntStream.range(2,16)
                .average()
                .getAsDouble();
        System.out.println(result);*/

       /* long result = IntStream.range(2,16)
                .sum();
        System.out.println(result);*/

      /*  LongSummaryStatistics statistics = LongStream.range(2,17)
                .summaryStatistics();
        System.out.format("   count: %d%n",statistics.getCount());
        System.out.format("     sum: %d%n",statistics.getSum());
        System.out.format("   average: %.1f%n", statistics.getAverage());
        System.out.format("     max: %d%n", statistics.getMax());
        System.out.format("   min: %d%n", statistics.getMin());*/

       /* Deque<Integer> deque = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toCollection(ArrayDeque::new));

        Set<Integer> set = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(deque);
        System.out.println(set);*/

       /* Map<Integer, Integer> map1 = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.toMap(
                        Function.identity(),
                        Function.identity()
                ));
        System.out.println(map1);

        System.out.println("------------------------");

        Map<Integer, String> map2 = Stream.of(1, 2 ,3, 4, 5)
                .collect(Collectors.toMap(
                        Function.identity(),
                        i->String.format("%d * 2 = %d", i, i*2)
                ));
        System.out.println(map2);

        System.out.println("------------------------");

        Map<Character, String> map3 = Stream.of(50, 55, 64)
                .collect(Collectors.toMap(
                        i->(char)i.intValue(),
                        i->String.format("<%d>",i)
                ));
        System.out.println(map3);*/

        /*Map<Integer, String> map4 = Stream.of(50, 55, 69, 20, 19, 52)
                .collect(Collectors.toMap(
                        i-> i % 5,
                        i->String.format("<%d>", i),
                        (a,b)->String.join(", ", a, b)
                ));
        System.out.println(map4);*/

        /*Map<Integer, String> map5 = Stream.of(50, 55, 69, 20, 19, 52)
                .collect(Collectors.toMap(
                        i->i % 5,
                        i->String.format("<%d>",i),
                        (a,b)->String.join(", ", a, b),
                        LinkedHashMap::new
                ));
        System.out.println(map5);*/

        List<String> list = Stream.of("a", "b", "c", "d")
                .collect(Collectors.collectingAndThen(
                        Collectors.toMap(
                                Function.identity(),
                                s->s + s
                        ),
                        map->map.entrySet().stream()
                ))
                .map(Object::toString)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        Collections::unmodifiableList
                ));
        list.forEach(System.out::println);

    }
}
