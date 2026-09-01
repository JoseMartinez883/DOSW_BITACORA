package dosw.semana_3.creational.ejercisio02AbstractFactory;

public interface ConsoleFactory {
    Controller createController();
    Game createGame();
    UI create();
}
