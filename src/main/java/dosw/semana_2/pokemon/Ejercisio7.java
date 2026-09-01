package dosw.semana_2.pokemon;

import java.util.List;

public class Ejercisio7 {

    public static void main(String[] args){

        List<String> pokemons = List.of("Squirtle", "Pikachu", "Mewtwo",
                "Bulbasaur", "Charmander", "Abra"
        );

        List<String> pokemonsOrganizedAlphabetic = pokemons.stream().sorted().toList();

        System.out.println(pokemonsOrganizedAlphabetic);
    }
}
