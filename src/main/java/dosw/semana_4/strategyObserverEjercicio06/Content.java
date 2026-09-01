package dosw.semana_4.strategyObserverEjercicio06;

public class Content {

    private String title;
    private String genre;
    private double rating;

    public Content(String title, String genre, double rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public double getRating() { return rating; }

    @Override
    public String toString() {
        return title + " (" + genre + ", rating: " + rating + ")";
    }
}
