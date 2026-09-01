package dosw.semana_4.builderObserverEjercisio08;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final Size size;
    private final Meat meat;
    private final List<String> toppings;
    private final List<String> sides;

    private List<OrderObserver> observers = new ArrayList<>();

    // Constructor package-private, solo accesible para OrderBuilder
    Order(Size size, Meat meat, List<String> toppings, List<String> sides) {
        this.size = size;
        this.meat = meat;
        this.toppings = toppings;
        this.sides = sides;
    }

    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    public void confirm() {
        System.out.println("Confirmando pedido...");
        notifyObservers();
    }

    private void notifyObservers() {
        for (OrderObserver observer : observers) {
            observer.onOrderConfirmed(this);
        }
    }

    public Size getSize() { return size; }
    public Meat getMeat() { return meat; }
    public List<String> getToppings() { return toppings; }
    public List<String> getSides() { return sides; }

    @Override
    public String toString() {
        return "Hamburguesa " + size + " con " + meat +
               ", toppings=" + toppings + ", acompañamientos=" + sides;
    }
}
