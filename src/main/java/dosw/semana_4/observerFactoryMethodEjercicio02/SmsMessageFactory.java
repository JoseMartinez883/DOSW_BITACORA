package dosw.semana_4.observerFactoryMethodEjercicio02;

public class SmsMessageFactory implements MessageFactory {
    @Override
    public Message build(OrderEvent event) {
        return new Message("INFO: Pedido " + event.getId() + " -> " + event.getMessage());
    }
}
