package dosw.semana_2.pokemon;

import java.util.List;

public class Ejercisio3 {

    public static void main(String[] args){

        List<Integer> pokemonLevels  = List.of(45, 62, 38, 71, 55, 29);

        int sumLevels = pokemonLevels.stream()
                .reduce(0, Integer::sum);

        System.out.println("suma total de niveles: " + sumLevels);
    }
}
