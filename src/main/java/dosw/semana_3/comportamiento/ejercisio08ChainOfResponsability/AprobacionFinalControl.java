package dosw.semana_3.comportamiento.ejercisio08ChainOfResponsability;

public class AprobacionFinalControl extends ControlMigratorioHandler{

    @Override
    public void processar(IngresoRequest request) {
        request.setAprobado(true);
        System.out.println("Visa aprobada");
    }
}
