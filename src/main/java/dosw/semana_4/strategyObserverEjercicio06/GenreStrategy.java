package dosw.semana_4.strategyObserverEjercicio06;

import java.util.Arrays;
import java.util.List;

public class GenreStrategy implements RecommendationAlgorithm {

    @Override
    public List<Content> recommend(User user) {
        System.out.println("  [GenreStrategy] Recomendando por genero favorito...");
        return Arrays.asList(
                new Content("Breaking Bad", "Drama", 9.5),
                new Content("The Crown", "Drama", 8.7)
        );
    }
}
