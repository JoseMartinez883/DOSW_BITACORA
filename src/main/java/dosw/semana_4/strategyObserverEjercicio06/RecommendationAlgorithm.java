package dosw.semana_4.strategyObserverEjercicio06;

import java.util.List;

public interface RecommendationAlgorithm {

    List<Content> recommend(User user);
}
