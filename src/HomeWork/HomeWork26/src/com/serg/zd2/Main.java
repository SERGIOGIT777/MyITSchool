package HomeWork.HomeWork26.src.com.serg.zd2;

import java.util.Scanner;
import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Способ вывода умножения:" +
                "\n1. От 2 до 9;" +
                "\n2. Табличный как в тетрадях;");
        Scanner sc = new Scanner(System.in);
        int spos = sc.nextInt();
        switch (spos){
            case 1:
                umnoj();
                break;
            case 2:
                umnoj4x4();
                break;
        }
    }

    public static void umnoj(){
        IntStream.rangeClosed(2, 9)
                .boxed()
                .flatMap(i -> IntStream.rangeClosed(2,9)
                        .mapToObj(j -> String.format("%d * %d = %d", i, j, i * j)))
                .forEach(System.out::println);
    }

    public  static void umnoj4x4() {
        IntFunction<IntFunction<String>> function = i -> j -> String.format("%d * %2d = %2d", i, j, i * j);
        IntFunction<IntFunction<IntFunction<String>>> repeaterX = count -> i -> j ->
                IntStream.range(0, count)
                        .mapToObj(delta -> function.apply(i + delta).apply(j))
                        .collect(Collectors.joining("\t\t"));
        IntFunction<IntFunction<IntFunction<IntFunction<String>>>> repeaterY = countY -> countX -> i -> j ->
                IntStream.range(0, countY)
                        .mapToObj(deltaY -> repeaterX.apply(countX).apply(i).apply(j + deltaY))
                        .collect(Collectors.joining("\n"));
        IntFunction<String> row = i -> repeaterY.apply(10).apply(4).apply(i).apply(1) + "\n";
        IntStream.of(2, 6).mapToObj(row).forEach(System.out::println);
    }
}
