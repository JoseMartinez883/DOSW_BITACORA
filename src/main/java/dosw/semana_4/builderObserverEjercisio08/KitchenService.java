package dosw.semana_4.builderObserverEjercisio08;

public class KitchenService implements OrderObserver {
    @Override
    public void onOrderConfirmed(Order order) {
        System.out.println("[Cocina] Preparando pedido: " + order);
    }
}
