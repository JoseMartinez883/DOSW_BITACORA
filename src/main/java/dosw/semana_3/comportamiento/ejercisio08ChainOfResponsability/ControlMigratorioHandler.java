package dosw.semana_3.comportamiento.ejercisio08ChainOfResponsability;

public abstract class ControlMigratorioHandler implements ControlMigratorio {

    private ControlMigratorio siguiente;

    @Override
    public void setSiguiente(ControlMigratorio siguiente) {
        this.siguiente = siguiente;
    }

    public void pasarAlSiguiente(IngresoRequest request){
        if(siguiente != null){
            this.siguiente.processar(request);
        } else {
            System.out.println("Tu visa esta en proceso espera de 4  a 6 meses .....");
        }
    }


}
