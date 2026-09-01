package dosw.semana_4.observerFactoryMethodEjercicio02;

public class PushNotifier implements NotificationObserver{
    private final MessageFactory factory = new PushMessageFactory();

    @Override
    public void notify(OrderEvent event) {
        Message msg = factory.build(event);
        System.out.println("Notificacion : la orden cambio de estado, nuevo estado es " + event.getMessage());
    }
}
