package dosw.semana_4.builderObserverEjercisio08;

public class BillingService implements OrderObserver {
    @Override
    public void onOrderConfirmed(Order order) {
        System.out.println("[Facturación] Generando cuenta para el pedido.");
    }
}
