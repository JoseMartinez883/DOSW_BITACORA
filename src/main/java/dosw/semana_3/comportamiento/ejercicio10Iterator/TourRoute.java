package dosw.semana_3.comportamiento.ejercicio10Iterator;

/**
 * Esta seria la estructura de datos, como nos damos cuenta guarda uan estructura de datos
 */
public class TourRoute implements Aggregate<Place>{

    private final Place[] places;

    public TourRoute(){
        places = new Place[] {
                new Place("Colosseum"),
                new Place("Roman Forum"),
                new Place("Trevi Fountain"),
                new Place("Pantheon"),
                new Place("Spanish Steps")
        };
    }

    public Iterator<Place> createIterator(){
        return new RomeIterator();
    }

    /**
     * Implementar el iterador, como se hara el recorrido
     */
    private class RomeIterator implements Iterator<Place>{

        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < places.length;
        }

        @Override
        public Place next() {
            return places[currentIndex++];
        }
    }
}


