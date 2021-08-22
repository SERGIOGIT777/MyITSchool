package Lesson.Student25.src.com.serg.zd1;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
		/*int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
		int count = 0;
		for (int x : arr) {
			if (x >= 90) continue;
			x += 10;
			count++;
			if (count > 3) break;
			System.out.print(x);
		}*/

		/*IntStream.of(50, 60, 70, 80, 90, 100, 110, 120)
				.filter(x->x<90)
				.map(x->x+10)
				.limit(3)
				.forEach(System.out::print);*/
		/*String[] array = {"Java", "Ruuuuussshhh"};
		Stream<String> streamOfArray = Arrays.stream(array);
		streamOfArray.map(s->s.split(""))//соединение элементов в один
				.flatMap(Arrays::stream).distinct()//проверка на уникальность (убирает повторы)
				.collect(Collectors.toList())
				.forEach(System.out::print);*/

		/*Stream.of(2, 3, 0, 1, 3, 3)
				.flatMapToInt(x -> IntStream.range(0, x))
				.filter(x->x<2)
				.map(x->x+3)
				.filter(x->x<4)
				.distinct()
				.forEach(System.out::print);*/
		//System.out.print(IntStream.of(2,4,3,7,5,2,6,3).reduce(2,(x,x1)->x+x1));
		//System.out.print(IntStream.of(2,4,3,7,5,2,6,3).anyMatch(x->x<3));
		//System.out.print(Stream.of(2,4,3,7,5,2,6,3).collect(Collectors.summingInt(x->3*x)));

        //Расчет числа фибоначи (Stream API)
        Stream.iterate(new int[]{0,1},arr->new int[]{arr[1], arr[0] + arr[1]})
                .limit(10)
                .map(y->y[0])
                .forEach(System.out::println);
        int res = Stream.iterate(new int[]{0,1}, arr->new int[]{arr[1], arr[0]+arr[1]})
                .limit(10)
                .map(y->y[0])
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("Сумма = " + res);
    }
}
