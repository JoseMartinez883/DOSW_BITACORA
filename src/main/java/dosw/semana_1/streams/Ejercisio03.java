package dosw.semana_1.streams;

import java.util.List;

public class Ejercisio03 {

    public static void main(String[] args){

        List<User> users = List.of(new User(100010202,"Jose",10,true),
                new User(34242424,"Alex",34,false),
                new User(342424242,"Pepe",324,true),
                new User(4636363,"Fernanada",342,true),
                new User(58594202,"Joselito",32425,true)
        );

        // forma 1
        List<String> result = users.stream()
                .filter(User::isActive)
                .map(User::getName)
                .map(String::toUpperCase)
                .sorted()
                .toList();

        System.out.println(result);

        // forma 2
        List<String> resultado = users.stream()
                .filter(User::isActive)
                .map(u -> u.getName().toUpperCase())
                .sorted()
                .toList();

        System.out.println(resultado);



    }
}
