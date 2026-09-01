package dosw.semana_2.pokemon;

import java.util.List;

public class Ejercisio1 {

    public static void main(String[] args){

        List<String> pokemons = List.of("Pikachu(Eléctrico)", "Charmander(Fuego)",
                "Squirtle(Agua)", "Vulpix(Fuego)",
                "Bulbasaur(Planta)", "Flareon(Fuego)"
        );

        // nota
        /*
        * NOTA
        * substring(inicio) comienza desde inicio posicion hasta el resto del string, toma final, como la length string -1
        * substring(inicio,final) , aca el inicio es incluye, el final no
        * indexOf("char") devuelve el indice de la caracter indicado para obtener su posicion, si no existe da -1
         */
        List<String> pokemonsTypeFire = pokemons.stream().filter(pokemon ->
                        pokemon.substring(pokemon.indexOf("(") + 1,
                        pokemon.indexOf(")")).equalsIgnoreCase("fuego"))
                        .map(pokemon -> pokemon.substring(0,pokemon.indexOf("(")))
                                .toList();

        System.out.println(pokemonsTypeFire);
    }
}
