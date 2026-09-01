package dosw.semana_3.comportamiento.ejercicio09Command;

public class AttackCommand implements Command{

    private GameCharacter character;

    public AttackCommand(GameCharacter character) {
        this.character = character;
    }


    @Override
    public void execute() {
        character.attack();
    }
}
