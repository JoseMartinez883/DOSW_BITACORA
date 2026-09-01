package dosw.semana_3.comportamiento.ejercicio11Estrategy;

public class Main {

    public static void main(String[] args){

        NavigationApp app = new NavigationApp(new FastestRoute());
        app.startNavigation();

        app.setRouteStragey(new ScenicRoute());
        app.startNavigation();

        app.setRouteStragey(new CheapestRoute());
        app.startNavigation();

    }
}
