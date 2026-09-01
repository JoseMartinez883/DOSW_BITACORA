package dosw.semana_4.builderObserverEjercisio08;

public class Main {
    public static void main(String[] args) {
        Order order = new OrderBuilder()
                .setSize(Size.LARGE)
                .setMeat(Meat.DOUBLE_BEEF)
                .addTopping("queso", "lechuga")
                .addSide("papas", "gaseosa")
                .build(); // Order inmutable

        order.addObserver(new KitchenService());
        order.addObserver(new BillingService());
        order.addObserver(new DeliveryService());

        order.confirm(); // notifica a los 3 observers
    }
}
