package dosw.semana_2.pokemon;

import java.util.List;

public class Ejercisio6 {


    public static void main(String[] args){

        List<String> pokemons = List.of("Pikachu", "Charmander", "Pikachu",
                "Squirtle", "Charmander", "Mewtwo"
        );

        List<String> pokemonsUnique = pokemons.stream().distinct().toList();

        System.out.println(pokemonsUnique);
    }
}
