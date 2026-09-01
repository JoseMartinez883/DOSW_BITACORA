package dosw.semana_3.comportamiento.ejercicio10Iterator;

/**
 * La interfaz de la coleccion que colecion queremos, queremos una Iterator
 * ya que esta ps ya por si nos esta obligando a cumplir con sus metodos
 * @param <T>
 */
public interface Aggregate<T> {
    Iterator<T> createIterator();
}
