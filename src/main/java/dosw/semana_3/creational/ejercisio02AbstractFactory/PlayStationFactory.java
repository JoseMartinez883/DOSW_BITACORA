package dosw.semana_3.creational.ejercisio02AbstractFactory;

public class PlayStationFactory implements ConsoleFactory{
    @Override
    public Controller createController() {
        return new PlayStationController();
    }

    @Override
    public Game createGame() {
        return new PlayStationGame();
    }

    @Override
    public UI create() {
        return new PlayStationUI();
    }
}
