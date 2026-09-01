package dosw.semana_2.pokemon;

import java.util.Comparator;
import java.util.List;

public class Ejercisio15 {

    public static void main(String[] args){
        List<Entrenador> coachs = List.of(
                new Entrenador(0L,"Ash",8,null),
                new Entrenador(1L,"Misty",5,null),
                new Entrenador(2L,"Brock",6,null),
                new Entrenador(3L,"Gary",10,null)
        );

        Entrenador coachHigherMedals = coachs.stream()
                .max(Comparator.comparing(Entrenador::getMedallas)).orElse(null);

        System.out.println("Campeon de gimnsios: " + coachHigherMedals.getNombre());
        System.out.println("Medallas obtenidas: " + coachHigherMedals.getMedallas());
    }
}
