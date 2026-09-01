package dosw.semana_4.chainOfResponsibilityStateEjercicio07;

public class RejectedState implements DocumentState {

    @Override
    public void approve(Document doc) {
        System.out.println("  [State] Documento rechazado vuelve a BORRADOR para correccion");
        doc.setState(new DraftState());
    }

    @Override
    public void reject(Document doc) {
        System.out.println("  [State] El documento ya esta RECHAZADO");
    }

    @Override
    public String getStateName() {
        return "RECHAZADO";
    }
}
