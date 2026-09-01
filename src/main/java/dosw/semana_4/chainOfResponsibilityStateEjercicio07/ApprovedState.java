package dosw.semana_4.chainOfResponsibilityStateEjercicio07;

public class ApprovedState implements DocumentState {

    @Override
    public void approve(Document doc) {
        System.out.println("  [State] El documento ya esta APROBADO");
    }

    @Override
    public void reject(Document doc) {
        System.out.println("  [State] No se puede rechazar un documento ya aprobado");
    }

    @Override
    public String getStateName() {
        return "APROBADO";
    }
}
