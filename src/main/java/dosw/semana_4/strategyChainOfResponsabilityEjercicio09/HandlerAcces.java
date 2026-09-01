package dosw.semana_4.strategyChainOfResponsabilityEjercicio09;


public interface HandlerAcces {

    void setNext(HandlerAcces handlerAcces);
    void handleAcces(AuthResult authResult);
}
