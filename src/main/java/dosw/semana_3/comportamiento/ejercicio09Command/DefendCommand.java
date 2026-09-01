package dosw.semana_3.comportamiento.ejercicio09Command;

public class DefendCommand implements Command{

    private GameCharacter character;

    public DefendCommand(GameCharacter character) {
        this.character = character;
    }


    @Override
    public void execute() {
        character.defend();
    }
}
