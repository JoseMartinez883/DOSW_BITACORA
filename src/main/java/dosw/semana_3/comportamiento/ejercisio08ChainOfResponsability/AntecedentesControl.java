package dosw.semana_3.comportamiento.ejercisio08ChainOfResponsability;

public class AntecedentesControl extends ControlMigratorioHandler{

    @Override
    public void processar(IngresoRequest request) {
        if(request.isAntecedentesLimpios()){
            pasarAlSiguiente(request);
        } else {
            System.out.println("Visa No Aprobada");
        }
    }

}
