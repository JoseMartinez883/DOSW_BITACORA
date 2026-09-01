package dosw.semana_2.pokemon;

import java.util.List;
import java.util.function.Function;

public class Ejercisio9 {

    public static void main(String[] args){

        List<String> pokemons = List.of(
            "Pikachu(PC:320)", "Mewtwo(PC:680)",
            "Dragonite(PC:530)", "Squirtle(PC:210)",
            "Gengar(PC:495)", "Charizard(PC:610)"
        );

        Function<String,Integer> extractPowerPokemon = pokemon -> {
            String powerPokemon = pokemon.substring(pokemon.indexOf(":") + 1,pokemon.indexOf(")"));
            return Integer.parseInt(powerPokemon);
        };

        List<String> pokemonHighPower500 = pokemons.stream()
                .filter(pokemon -> extractPowerPokemon.apply(pokemon) > 500)
                .map(pokemon -> pokemon.substring(0,pokemon.indexOf("(")) + "(" + extractPowerPokemon.apply(pokemon) + ")")
                .toList();

        System.out.println("Equipo Elite (PC > 500):");
        System.out.println(pokemonHighPower500);
    }
}
