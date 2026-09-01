package dosw.semana_2.pokemon;

import java.util.List;
import java.util.function.Function;

public class Ejercisio5 {

    public static void main(String[] args){

        List<String> pokemons = List.of("Pikachu(45)", "Mewtwo(88)", "Dragonite(82)",
                "Squirtle(38)", "Mew(85)", "Charmander(62)"
        );

        Function<String,Integer> getLevel = pokemon -> {
            String substring = pokemon.substring(pokemon.indexOf("(") + 1, pokemon.indexOf(")"));
            return Integer.parseInt(substring);
        };

        List<String> pokemonsLevel80 = pokemons.stream()
                .filter(pokemon -> getLevel.apply(pokemon) > 80)
                .map(pokemon -> pokemon.substring(0,pokemon.indexOf("(")))
                .toList();

        System.out.println("Pokemon con nivel > 80: " + pokemonsLevel80.stream().count());
        System.out.println(pokemonsLevel80);


    }
}
