package dosw.semana_4.observerFactoryMethodEjercicio02;


public class SmsNotifier implements NotificationObserver{
    private final MessageFactory factory = new SmsMessageFactory();

    @Override
    public void notify(OrderEvent event) {
        System.out.println("Notificacion SMS: la orden cambio de estado, nuevo estado es " + event.getMessage());
    }

}
