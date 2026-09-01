package dosw.semana_4.observerFactoryMethodEjercicio02;

public class EmailNotifier implements NotificationObserver{

    @Override
    public void notify(OrderEvent event) {
        System.out.println("Notificacion EMAIL: la orden cambio de estado, nuevo estado es " + event.getMessage());
    }
}
