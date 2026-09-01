package dosw.semana_4.chainOfResponsibilityStateEjercicio07;

public class Main {

    public static void main(String[] args) {

        // Configurar la cadena de responsabilidad
        AutorHandler autor = new AutorHandler();
        LiderHandler lider = new LiderHandler();
        JuridicoHandler juridico = new JuridicoHandler();
        FinancieroHandler financiero = new FinancieroHandler();

        autor.setNext(lider).setNext(juridico).setNext(financiero);

        // Documento tipo contrato — pasa por todos los handlers
        System.out.println("========== DOCUMENTO CONTRATO ==========");
        Document contrato = new Document("Contrato de servicios", "contrato", "Clausulas del contrato...");
        System.out.println("Estado inicial: " + contrato.getStateName());
        autor.handle(contrato);
        System.out.println("Estado final: " + contrato.getStateName());

        // Documento tipo interno — no pasa por juridico ni financiero
        System.out.println("\n========== DOCUMENTO INTERNO ==========");
        Document memo = new Document("Memo interno", "interno", "Contenido del memo...");
        System.out.println("Estado inicial: " + memo.getStateName());
        autor.handle(memo);
        System.out.println("Estado final: " + memo.getStateName());
    }
}
