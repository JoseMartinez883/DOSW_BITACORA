package dosw.semana_2.pokemon;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercisio10 {


    public static void main(String[] args){

        List<Pokemon> pokemons = List.of(
                new Pokemon(1L,"Pikachu","nose",33,353.4,"nose",true),
                new Pokemon(1L,"Mewto","nose",33,353.4,"nose",true),
                new Pokemon(1L,"Dragonite","nose",33,353.4,"nose",true),
                new Pokemon(1L,"Squirtle","nose",33,353.4,"nose",true),
                new Pokemon(1L,"Gengar","nose",33,353.4,"nose",true),
                new Pokemon(1L,"Charizard","nose",33,353.4,"nose",true)
        );

        List<String> pokemonNames = pokemons.stream()
                .map(Pokemon::getNombre)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(pokemonNames);
    }
}
