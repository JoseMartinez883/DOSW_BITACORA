package dosw.semana_3.comportamiento.ejercicio11Estrategy;

public class NavigationApp {

    private RouteStragey routeStragey;

    public NavigationApp(RouteStragey routeStragey) {
        this.routeStragey = routeStragey;
    }

    public void setRouteStragey(RouteStragey routeStragey) {
        this.routeStragey = routeStragey;
    }

    public void startNavigation(){
        routeStragey.calculateRoute();
    }
}
