package dosw.semana_3.comportamiento.ejercisio08ChainOfResponsability;

public class MotivoViajeControl extends ControlMigratorioHandler{
    @Override
    public void processar(IngresoRequest request) {
        if(request.isMotivoValido()){
            pasarAlSiguiente(request);
        } else {
            System.out.println("Visa no aprobada");
        }
    }
}
