package dosw.semana_4.builderObserverEjercisio08;

public class DeliveryService implements OrderObserver {
    @Override
    public void onOrderConfirmed(Order order) {
        System.out.println("[Domicilio] Preparando ruta de entrega para el pedido.");
    }
}
