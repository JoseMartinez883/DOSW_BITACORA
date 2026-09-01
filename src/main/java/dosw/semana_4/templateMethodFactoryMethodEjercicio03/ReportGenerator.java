package dosw.semana_4.templateMethodFactoryMethodEjercicio03;

public abstract class ReportGenerator {

    // Template Method — define el esqueleto del algoritmo
    public final void generate() {
        fetchData();
        processData();
        applyFormat();
        exportFile();
    }

    // Pasos fijos
    protected void fetchData() {
        System.out.println("Obteniendo datos de la base de datos...");
    }

    protected void processData() {
        System.out.println("Procesando informacion...");
    }

    // Pasos variables — cada subclase los implementa
    protected abstract void applyFormat();
    protected abstract void exportFile();
}
