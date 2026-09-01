package dosw.semana_4.chainOfResponsibilityStateEjercicio07;

public class JuridicoHandler extends DocumentHandler {

    @Override
    protected boolean canHandle(Document doc) {
        // Solo documentos legales o contratos pasan por juridico
        return doc.getType().equalsIgnoreCase("legal") || doc.getType().equalsIgnoreCase("contrato");
    }

    @Override
    protected void process(Document doc) {
        System.out.println("[JuridicoHandler] Revision juridica: " + doc.getTitle());
        System.out.println("  Revision legal aprobada");
        System.out.println("  Estado actual: " + doc.getStateName());
    }
}
