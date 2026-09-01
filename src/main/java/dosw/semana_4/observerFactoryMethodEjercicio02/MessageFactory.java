package dosw.semana_4.observerFactoryMethodEjercicio02;

public interface MessageFactory {
    Message build(OrderEvent event);
}
