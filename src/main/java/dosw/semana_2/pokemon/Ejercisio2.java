package dosw.semana_2.pokemon;

import java.util.List;

public class Ejercisio2 {

    public static void main(String[] args){

        List<String> pokemon = List.of("Pikachu", "Charmander", "Squirtle", "Bulbasaur");

        List<String> pokemonUpperCase = pokemon.stream().map(String::toUpperCase).toList();

        System.out.println(pokemonUpperCase);
    }
}
