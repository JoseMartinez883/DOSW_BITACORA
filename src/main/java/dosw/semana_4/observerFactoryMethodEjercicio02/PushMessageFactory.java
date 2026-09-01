package dosw.semana_4.observerFactoryMethodEjercicio02;


public class PushMessageFactory implements MessageFactory {

    @Override
    public Message build(OrderEvent event) {
        return new Message("{ \"title\": \"Actualización\", \"body\": \"Tu pedido "
                + event.getId() + " está " + event.getMessage() + "\" }");
    }

}