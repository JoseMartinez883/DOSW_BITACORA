package dosw.semana_3.comportamiento.ejercicio09Command;

import java.util.List;

public class Main {

    public static void main(String[] args){

        GameCharacter character = new GameCharacter();
        GameController controller = new GameController();

        List<Command> actions = List.of(
                new WalkCommand(character),
                new JumpCommand(character),
                new AttackCommand(character),
                new DefendCommand(character)
        );

        actions.forEach(controller::PressButton);

    }
}
