package dosw.semana_4.observerFactoryMethodEjercicio02;

public class EmailMessageFactory implements MessageFactory{

    @Override
    public Message build(OrderEvent event) {
        return new Message("El Email, la informacion de la orden es " + event.getId() + " Ahora esta en " + event.getMessage());
    }

}
