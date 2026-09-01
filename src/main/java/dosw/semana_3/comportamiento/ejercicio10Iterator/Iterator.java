package dosw.semana_3.comportamiento.ejercicio10Iterator;

/*
Interfaz iterador, nos sirve para recorrer elementos y todo eso, osea
se usa lo que la estructura de datos que no queremos exponer, debe cumplir con dichos
metodos
 */
public interface Iterator<T>{
    boolean hasNext();
    T next();
}
