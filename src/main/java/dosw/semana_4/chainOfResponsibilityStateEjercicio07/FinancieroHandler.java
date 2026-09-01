package dosw.semana_4.chainOfResponsibilityStateEjercicio07;

public class FinancieroHandler extends DocumentHandler {

    @Override
    protected boolean canHandle(Document doc) {
        // Solo documentos financieros o contratos pasan por financiero
        return doc.getType().equalsIgnoreCase("financiero") || doc.getType().equalsIgnoreCase("contrato");
    }

    @Override
    protected void process(Document doc) {
        System.out.println("[FinancieroHandler] Revision financiera: " + doc.getTitle());
        doc.approve(); // En revision -> Aprobado
        System.out.println("  Estado actual: " + doc.getStateName());
    }
}
