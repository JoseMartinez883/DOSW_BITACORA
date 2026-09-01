package dosw.semana_2.pokemon;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercisio20 {

    public static void main(String[] args){

        DecimalFormat db = new DecimalFormat("#,##0.#");

        List<Pokemon> pokemons = List.of(
                new Pokemon(1L,"Pikachu","Fuego",85,58.4,"Kanto",true),
                new Pokemon(1L,"Mewwwto","Fuego",70,58.4,"Kanto",true),
                new Pokemon(1L,"Dragonite","Fuego",60,58.4,"Kanto",false),
                new Pokemon(1L,"Squirtle","Fuego",55,58.4,"Kanto",false),
                new Pokemon(1L,"Gengar","Agua",50,58.4,"Kanto",false),
                new Pokemon(1L,"Mewt4o","Agua",45,58.4,"Jonto",false),
                new Pokemon(1L,"Mewto","Agua",44,680,"Jonto",false)
        );


        Map<String,Long> pokemonsByType = pokemons.stream()
                .collect(Collectors.groupingBy(
                        Pokemon::getTipo,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        Map<String,Long> pokemonsByRegion = pokemons.stream()
                .collect(Collectors.groupingBy(
                        Pokemon::getRegion,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        long amountLegenPokemons = pokemons.stream()
                .filter(Pokemon::isLegendario)
                .count();

        double averageLevelPokemons = pokemons.stream()
                .mapToDouble(Pokemon::getNivel)
                .average().orElse(0.0);

        Pokemon strongestPokemon = pokemons.stream()
                .max(Comparator.comparing(Pokemon::getPoderCombate)).orElse(null);

        System.out.println("Por tipo: " + pokemonsByType);
        System.out.println("Por Region: " + pokemonsByRegion);
        System.out.println("Legendarios: " + amountLegenPokemons);
        System.out.println("Promedio niv: " + db.format(averageLevelPokemons));
        System.out.println("Mas fuerte: " + strongestPokemon.getNombre() + " (PC: " + strongestPokemon.getPoderCombate() + ")");

    }
}
