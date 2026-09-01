package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Ejercisio4 {

    public static void main(String[] args){

        List<String> pokemons = List.of("Pikachu(45)", "Charmander(62)",
                "Squirtle(38)", "Snorlax(90)", "Mewtwo(88)"
        );

        Function<String,Integer> getLevel = pokemon -> {
            String substring = pokemon.substring(pokemon.indexOf("(") + 1, pokemon.indexOf(")"));
            return Integer.parseInt(substring);
        };

        String pokemonAlfa = pokemons.stream().max(Comparator
                .comparing(getLevel)).orElse("0");

        System.out.println("Pokemon Alfa: " + pokemonAlfa.substring(0,pokemonAlfa.indexOf("(")) + " (nivel " + getLevel.apply(pokemonAlfa) + ")");


    }
}
