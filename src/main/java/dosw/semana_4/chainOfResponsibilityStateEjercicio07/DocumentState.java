package dosw.semana_4.chainOfResponsibilityStateEjercicio07;

public interface DocumentState {

    void approve(Document doc);
    void reject(Document doc);
    String getStateName();
}
