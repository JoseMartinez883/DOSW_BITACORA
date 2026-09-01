package dosw.semana_2.pokemon;

import java.util.List;
import java.util.function.Function;

public class Ejercisio8 {


    public static void main(String[] args){

        List<String> pokemons = List.of("Pikachu(true)", "Raichu(false)",
                "Charmander(true)", "Charizard(false)",
                "Squirtle(true)", "Blastoise(false)"
        );

        Function<String,String> getEvolution = pokemon -> {
            return pokemon.substring(pokemon.indexOf("(") + 1, pokemon.indexOf(")"));
        };

        List<String> pokemonsReadyToEvolutionated = pokemons.stream()
                .filter(pokemon -> getEvolution.apply(pokemon).equalsIgnoreCase("true"))
                .map(pokemon -> pokemon.substring(0,pokemon.indexOf("(")))
                .toList();

        System.out.println("Listos para evolucionar:");
        System.out.println(pokemonsReadyToEvolutionated);

    }
}
