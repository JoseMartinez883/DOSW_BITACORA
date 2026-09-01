package dosw.semana_1;

import java.util.List;

public class Ejercisio04 {

    public static void main(String[] args){

        List<User> users = List.of(
                new User(1, "Carlos", 17, true),
                new User(2, "ana", 30, false),
                new User(3, "miguel", 15, true),
                new User(4, "beatriz", 28, true),
                new User(5, "juan", 35, true)
        );

        List<String> resultado = users.stream()
                .filter(u -> u.getAge() >= 18)
                .map(User::getName)
                .toList();

        System.out.println(resultado);
    }
}
