package dosw.semana_3.comportamiento.ejercisio08ChainOfResponsability;

public interface ControlMigratorio {

    void setSiguiente(ControlMigratorio siguiente);

    void processar(IngresoRequest request);
}
