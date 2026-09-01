package dosw.semana_3.comportamiento.ejercicio09Command;

public class GameController {

    public void PressButton(Command command){
        command.execute();
    }
}
