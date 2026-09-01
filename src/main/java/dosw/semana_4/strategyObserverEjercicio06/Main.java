package dosw.semana_4.strategyObserverEjercicio06;

public class Main {

    public static void main(String[] args) {

        User user = new User("Jose", new GenreStrategy());

        // Suscribir observers
        user.addObserver(new HomePageComponent());
        user.addObserver(new SuggestedListComponent());
        user.addObserver(new NotificationService());

        // Cambiar preferencia a genero -> notifica a todos los observers
        user.changePreference(new GenreStrategy());

        // Cambiar preferencia a historial -> notifica a todos los observers
        user.changePreference(new HistoryStrategy());

        // Cambiar preferencia a popularidad -> notifica a todos los observers
        user.changePreference(new PopularityStrategy());
    }
}
