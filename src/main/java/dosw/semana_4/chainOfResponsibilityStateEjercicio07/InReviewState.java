package dosw.semana_4.chainOfResponsibilityStateEjercicio07;

public class InReviewState implements DocumentState {

    @Override
    public void approve(Document doc) {
        System.out.println("  [State] En revision aprobado -> pasa a APROBADO");
        doc.setState(new ApprovedState());
    }

    @Override
    public void reject(Document doc) {
        System.out.println("  [State] En revision rechazado -> pasa a RECHAZADO");
        doc.setState(new RejectedState());
    }

    @Override
    public String getStateName() {
        return "EN REVISION";
    }
}
