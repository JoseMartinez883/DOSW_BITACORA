package dosw.semana_1;

import java.util.List;

public class Ejercisio01 {


    public static void main(String[] args){
        List<Integer> numbers = List.of(3,8,10,12,15,18,20);

        // forma 1
        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n > 10)
                .toList();

        System.out.println(result);

        // forma 2
        List<Integer> resultado = numbers.stream()
                .filter(n -> n  % 2 == 0 && n > 10)
                .toList();

        System.out.println(resultado);


    }
}
