package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Ejercisio12 {
    public static void main(String[] args){

        Function<String,Integer> getLevel = pokemon -> {
            String substring = pokemon.substring(pokemon.indexOf("(") + 1, pokemon.indexOf(")"));
            return Integer.parseInt(substring);
        };

        List<String> pokemons = List.of("Pikachu(320)", "Mewtwo(680)",
                "Dragonite(530)", "Charizard(610)"
        );

        String pokemonsHigherPower = pokemons.stream()
                .max(Comparator.comparing(getLevel)).orElse("Ninguno gano");

        System.out.println("Campeon: " + pokemonsHigherPower.substring(0,pokemonsHigherPower.indexOf("(")) + " con PC: " + getLevel.apply(pokemonsHigherPower));


    }
}
