package dosw.semana_4.chainOfResponsibilityStateEjercicio07;

public class AutorHandler extends DocumentHandler {

    @Override
    protected boolean canHandle(Document doc) {
        return true; // todos los documentos pasan por el autor
    }

    @Override
    protected void process(Document doc) {
        System.out.println("[AutorHandler] Revision del autor: " + doc.getTitle());
        doc.approve(); // Borrador -> En revision
        System.out.println("  Estado actual: " + doc.getStateName());
    }
}
