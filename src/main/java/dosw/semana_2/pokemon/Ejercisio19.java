package dosw.semana_2.pokemon;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.List;

public class Ejercisio19 {

    public static void main(String[] args){

        DecimalFormat db = new DecimalFormat("###0.##");

        List<Entrenador> coachs = List.of(
                new Entrenador(0L,"Gary",10,List.of(new Pokemon(1L,"pokemon","nose",1,2340,"nose",false))),
                new Entrenador(1L,"Ash",8,List.of(new Pokemon(1L,"pokemon","nose",1,1850,"nose",false))),
                new Entrenador(2L,"Dawn",7,List.of(new Pokemon(1L,"pokemon","nose",1,2100,"nose",false))),
                new Entrenador(2L,"Brock",6,List.of(new Pokemon(1L,"pokemon","nose",1,1670,"nose",false)))
        );

        coachs.stream()
                .sorted(Comparator.comparing(Entrenador::getMedallas).thenComparing(Entrenador::getSumTotalPowerTeam).thenComparing(Entrenador::getNombre).reversed())
                .limit(3)
                .forEach(entrenador -> System.out.println(entrenador.getNombre() + " - " + entrenador.getMedallas() + " medallas, " + " PC: " + db.format(entrenador.getSumTotalPowerTeam())));


    }
}
