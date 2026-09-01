package dosw.semana_4.chainOfResponsibilityStateEjercicio07;

public class LiderHandler extends DocumentHandler {

    @Override
    protected boolean canHandle(Document doc) {
        return true; // todos los documentos pasan por el lider
    }

    @Override
    protected void process(Document doc) {
        System.out.println("[LiderHandler] Revision del lider: " + doc.getTitle());
        System.out.println("  Lider aprueba el documento");
        System.out.println("  Estado actual: " + doc.getStateName());
    }
}
