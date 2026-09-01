package dosw.semana_3.comportamiento.ejercicio09Command;

public class WalkCommand implements Command{

    private GameCharacter character;

    public WalkCommand(GameCharacter character) {
        this.character = character;
    }

    @Override
    public void execute() {
        character.walk();
    }
}
