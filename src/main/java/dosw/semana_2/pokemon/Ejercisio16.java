package dosw.semana_2.pokemon;

import java.util.List;

public class Ejercisio16 {

    public static void main(String[] args){

        List<Entrenador> coachs = List.of(
                new Entrenador(0L,"Ash",8,null),
                new Entrenador(1L,"Misty",5,null),
                new Entrenador(2L,"Brock",6,null),
                new Entrenador(3L,"Gary",10,null),
                new Entrenador(3L,"Dawn",7,null)
        );

        List<String> coachWithMoreFiveMedals = coachs.stream()
                .filter(coach -> coach.getMedallas() > 5)
                .map(coach -> coach.getNombre() + "(" + coach.getMedallas() + ")")
                        .toList();

        System.out.println("Entrenadores con > 5 medallas:");
        System.out.println(coachWithMoreFiveMedals);
    }
}
