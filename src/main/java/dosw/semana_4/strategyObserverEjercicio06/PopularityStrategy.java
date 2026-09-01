package dosw.semana_4.strategyObserverEjercicio06;

import java.util.Arrays;
import java.util.List;

public class PopularityStrategy implements RecommendationAlgorithm {

    @Override
    public List<Content> recommend(User user) {
        System.out.println("  [PopularityStrategy] Recomendando por popularidad...");
        return Arrays.asList(
                new Content("Squid Game", "Thriller", 9.0),
                new Content("Wednesday", "Comedia", 8.5)
        );
    }
}
