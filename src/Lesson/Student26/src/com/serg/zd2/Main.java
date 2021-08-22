package Lesson.Student26.src.com.serg.zd2;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {
       /* StreamSupport.stream(
                Spliterators.spliteratorUnknownSize(
                        new FibonacciIterator(), Spliterator.ORDERED | Spliterator.SORTED),
                false)
                .limit(10)
                .forEach(System.out::println);
                
        */
        String [] argument = {"i", "in.txt", "--limit", "48", "-d", "1", "o", "0"};
        Map<String, String> argMap = new LinkedHashMap<>(argument.length/2);
        for(int i=0; i<argument.length; i+=2){
            argMap.put(argument[i], argument[i+1]);
        }
        argMap.forEach((key, value)->System.out.format("%s: %s%n", key, value));

        String[] args1 = argMap.entrySet().stream()
                        .flatMap(e->Stream.of(e.getKey(), e.getValue()))
                .toArray(String[]::new);
        System.out.println(String.join("      ", args1));
    }
}
/*class FibonacciIterator implements Iterator<BigInteger> {
    private BigInteger a = BigInteger.ZERO;
    private BigInteger b = BigInteger.ONE;

    @Override
    public boolean hasNext(){
        return true;
    }

    @Override
    public BigInteger next() {
        BigInteger result = a;
        a = b;
        b = result.add(b);
        return result;
        

    }
}

 */

