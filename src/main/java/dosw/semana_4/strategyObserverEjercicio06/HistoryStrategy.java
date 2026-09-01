package dosw.semana_4.strategyObserverEjercicio06;

import java.util.Arrays;
import java.util.List;

public class HistoryStrategy implements RecommendationAlgorithm {

    @Override
    public List<Content> recommend(User user) {
        System.out.println("  [HistoryStrategy] Recomendando basado en historial...");
        return Arrays.asList(
                new Content("Stranger Things", "Sci-Fi", 8.8),
                new Content("Dark", "Sci-Fi", 8.9)
        );
    }
}
