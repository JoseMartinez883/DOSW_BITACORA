package dosw.semana_2.pokemon;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercisio14 {

    public static void main(String[] args){

        List<String> pokemons = List.of("Pikachu(Kanto)", "Chikorita(Johto)",
                "Torchic(Hoenn)", "Piplup(Sinnoh)",
                "Charmander(Kanto)", "Totodile(Johto)"
        );

        Function<String,String> getPokemonRegion = pokemon -> {
            return pokemon.substring(pokemon.indexOf("(") + 1, pokemon.indexOf(")"));
        };

        Map<String, List<String>> pokemonByRegions = pokemons.stream()
                .collect(Collectors.groupingBy(
                        getPokemonRegion,
                        LinkedHashMap::new,
                        Collectors.mapping(pokemon -> pokemon.substring(0,pokemon.indexOf("(")), Collectors.toList())
                ));

        pokemonByRegions.forEach((key,value) ->
                System.out.println(key + ": " + value));


    }
}
