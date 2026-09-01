package dosw.semana_4.chainOfResponsibilityStateEjercicio07;

public class DraftState implements DocumentState {

    @Override
    public void approve(Document doc) {
        System.out.println("  [State] Borrador aprobado -> pasa a EN REVISION");
        doc.setState(new InReviewState());
    }

    @Override
    public void reject(Document doc) {
        System.out.println("  [State] Borrador rechazado -> permanece como BORRADOR");
    }

    @Override
    public String getStateName() {
        return "BORRADOR";
    }
}
