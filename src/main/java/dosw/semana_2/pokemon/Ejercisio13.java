package dosw.semana_2.pokemon;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ejercisio13 {

    public static void main(String[] args){

        List<String> pokemons = List.of("Squirtle(Agua)", "Psyduck(Agua)",
                "Charmander(Fuego)", "Vulpix(Fuego)",
                "Bulbasaur(Planta)"
        );

        Function<String,String> getTypePokemon = pokemon -> {
            return pokemon.substring(pokemon.indexOf("(") + 1, pokemon.indexOf(")"));
        };

        Map<String,List<String>> pokemonsByTypes = pokemons.stream()
                .collect(Collectors.groupingBy(
                        pokemon -> getTypePokemon.apply(pokemon),
                        TreeMap::new,
                        Collectors.mapping(pokemon -> pokemon.substring(0,pokemon.indexOf("(")),Collectors.toList())
                ));

        pokemonsByTypes.forEach((key, value) -> System.out.println(key + ":" + " " + value));

    }
}
