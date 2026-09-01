package dosw.semana_3.creational.ejercisio02AbstractFactory;

public class XboxFactory implements ConsoleFactory{
    @Override
    public Controller createController() {
        return new XboxController();
    }

    @Override
    public Game createGame() {
        return new XboxGame();
    }

    @Override
    public UI create() {
        return new XboxUI();
    }
}
