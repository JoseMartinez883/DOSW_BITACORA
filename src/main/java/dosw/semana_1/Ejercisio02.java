package dosw.semana_1;

import java.util.List;

public class Ejercisio02 {

    public static void main(String[] args){

        List<String> words = List.of("java","stream","api","functional","code","git");

        // forma 1
        List<String> processed = words.stream()
                .filter(w -> w.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        long count = processed.stream().count();

        System.out.println(processed);
        System.out.println(count);

        // forma 2
        long cantidad = words.stream()
                .filter(w -> w.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .peek(System.out::println)
                .count();

        System.out.println(cantidad);
    }
}
