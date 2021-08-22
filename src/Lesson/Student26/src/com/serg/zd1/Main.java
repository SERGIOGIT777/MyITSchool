package Lesson.Student26.src.com.serg.zd1;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	/*Long count = Stream.of("1", "2", "3" , "4", "5", "6")
            .collect(Collectors.counting());
	System.out.println(count);*/

        /*Map<Boolean, List<String>> map1 = Stream.of ("ab",
                "c", "def", "gh", "ijk", "l")
                .collect(Collectors.partitioningBy(s->s.length()<=2));
        map1.entrySet().forEach(System.out::println);

        System.out.println();

        Map<Boolean, String> map2 = Stream.of ("ab",
                "c", "def", "gh", "ijk", "l")
                .collect(Collectors.partitioningBy(s->s.length()<=2,
                Collectors.mapping(
                        String::toUpperCase,
                        Collectors.joining()
                )));
        map2.entrySet().forEach(System.out::println);

         */

        /*Stream.of(1, 2, 3, 1, 7, 3, 5, 4, 5, 8)
                .collect(Collectors.collectingAndThen(
                        Collectors.toCollection(LinkedHashSet::new),
                        ArrayList::new))
        .forEach(System.out::println);

         */

/*        final Set<Integer> element = new HashSet<>();
        Stream.of(1, 2, 3, 1, 7, 3, 5, 4, 5, 8)
                .collect(Collectors.partitioningBy(element::add))
                .forEach((isUnique, list)->System.out.format("%s: %s%n",
                isUnique ? "unique" : "repeative", list));

 */
        Map<Boolean, List<Integer>> map;
        map = Stream.of(1, 2, 3, 1, 7, 3, 5, 4, 5, 8)
                .collect(partitionByUniqueness());
        System.out.println(map);
    }
    public static <T> Collector<T, ?, Map<Boolean, List<T>>>
    partitionByUniqueness() {
        return Collector.<T, Map.Entry<List<T>, Set<T>>, Map<Boolean, List<T>>> of(
                //supplier
                ()->new
                        AbstractMap.SimpleImmutableEntry<>(
                        new ArrayList<>(), new
                        LinkedHashSet<>()),
                //accumulator
                (c, e)->{
                    if(!c.getValue().add(e)){
                        c.getKey().add(e);
                                    }
                        },
                //combiner
                (c1,c2)->{
                    c1.getKey().addAll(c2.getKey());
                    for(T e : c2.getValue()){
                        if(!c1.getValue().add(e)){
                            c1.getKey().add(e);
                                        }
                                    }
                    return c1;
                        },
                //finisher
                        c-> {
                            Map<Boolean, List<T>> result = new HashMap<>(2);
                            result.put(Boolean.FALSE, c.getKey());
                            result.put(Boolean.TRUE, new ArrayList<>(c.getValue()));
                            return result;
                        }
                );
    }
}
