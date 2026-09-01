package dosw.semana_3.creational.ejercisio02AbstractFactory;

public class GameEngine {

    private Controller controller;
    private Game game;
    private UI ui;
    private final ConsoleFactory factory;

    public GameEngine(ConsoleFactory factory){
        this.factory = factory;
    }

    public void run(){
        factory.createController().connect();
        factory.createGame().start();
        factory.create().render();
    }


}
