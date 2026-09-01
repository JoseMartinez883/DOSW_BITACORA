package dosw.semana_4.strategyObserverEjercicio06;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private RecommendationAlgorithm algorithm;
    private List<PreferenceObserver> observers = new ArrayList<>();

    public User(String name, RecommendationAlgorithm algorithm) {
        this.name = name;
        this.algorithm = algorithm;
    }

    public String getName() { return name; }
    public RecommendationAlgorithm getAlgorithm() { return algorithm; }

    public void addObserver(PreferenceObserver observer) {
        observers.add(observer);
    }

    public void changePreference(RecommendationAlgorithm newAlgorithm) {
        System.out.println("\n====== " + name + " cambio su preferencia de recomendacion ======");
        this.algorithm = newAlgorithm;
        notifyObservers();
    }

    private void notifyObservers() {
        for (PreferenceObserver observer : observers) {
            observer.onPreferenceChanged(this);
        }
    }
}
