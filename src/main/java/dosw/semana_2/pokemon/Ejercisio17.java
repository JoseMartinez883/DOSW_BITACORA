package dosw.semana_2.pokemon;

import java.text.DecimalFormat;
import java.util.Comparator;
import java.util.List;

public class Ejercisio17 {

    public static void main(String[] args){
        DecimalFormat db = new DecimalFormat("###0.##");

        List<Entrenador> coachs = List.of(
                new Entrenador(0L,"Ash",8,List.of(new Pokemon(1L,"pokemon","nose",1,1850,"nose",false))),
                new Entrenador(1L,"Misty",5,List.of(new Pokemon(1L,"pokemon","nose",1,2340,"nose",false))),
                new Entrenador(2L,"Brock",6,List.of(new Pokemon(1L,"pokemon","nose",1,1670,"nose",false)))
        );

        Entrenador coachesHighestPowerComabt = coachs.stream()
                .max(Comparator.comparing(Entrenador::getSumTotalPowerTeam)).orElse(null);

        System.out.println("Entrenador mas poderoso: " + coachesHighestPowerComabt.getNombre());
        System.out.println("Poder acumulado del equipo: " + db.format(coachesHighestPowerComabt.getSumTotalPowerTeam()));
    }
}
