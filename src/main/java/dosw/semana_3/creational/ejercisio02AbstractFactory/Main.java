package dosw.semana_3.creational.ejercisio02AbstractFactory;

public class Main {

    public static void main(String[] args){

        ConsoleFactory factory;

        factory = new PlayStationFactory();
        GameEngine psEngine = new GameEngine(factory);
        psEngine.run();

        System.out.println("-----");

        factory = new XboxFactory();
        GameEngine xboxEngine = new GameEngine(factory);
        xboxEngine.run();
    }
}
