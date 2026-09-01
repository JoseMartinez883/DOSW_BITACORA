package dosw.semana_3.comportamiento.ejercicio09Command;

public class JumpCommand implements Command{

    private GameCharacter character;

    public JumpCommand(GameCharacter character){
        this.character = character;
    }

    @Override
    public void execute() {
        character.jump();
    }
}
