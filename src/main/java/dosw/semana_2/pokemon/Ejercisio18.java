package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

public class Ejercisio18 {

    public static void main(String[] args){

        List<Pokemon> pokemonList = List.of(
                new Pokemon(1L,"Mewtwo","nose",1,680,"nose",false),
                new Pokemon(1L,"Charizard","nose",1,610,"nose",false),
                new Pokemon(1L,"Dragonite","nose",1,530,"nose",false),
                new Pokemon(1L,"Gengar","nose",1,495,"nose",false),
                new Pokemon(1L,"Pikachu","nose",1,320,"nose",false)
        );

        //int positionRanked = 1;
        pokemonList.stream()
            .limit(5)
            .sorted(Comparator.comparing(Pokemon::getPoderCombate).reversed())
            .forEach(pokemon -> System.out.println(pokemon.getNombre() + " - PC: " + pokemon.getPoderCombate() ));
    }
}
