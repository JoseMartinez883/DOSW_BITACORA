package dosw.semana_4.strategyObserverEjercicio06;

import java.util.List;

public class HomePageComponent implements PreferenceObserver {

    @Override
    public void onPreferenceChanged(User user) {
        System.out.println("\n[HomePage] Actualizando pagina principal para " + user.getName());
        List<Content> recommendations = user.getAlgorithm().recommend(user);
        recommendations.forEach(c -> System.out.println("    -> " + c));
    }
}
