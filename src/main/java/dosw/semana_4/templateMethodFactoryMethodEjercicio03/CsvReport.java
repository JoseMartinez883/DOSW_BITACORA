package dosw.semana_4.templateMethodFactoryMethodEjercicio03;

public class CsvReport extends ReportGenerator {

    @Override
    protected void applyFormat() {
        System.out.println("[CSV] Aplicando formato separado por comas...");
    }

    @Override
    protected void exportFile() {
        System.out.println("[CSV] Exportando archivo: reporte.csv");
    }
}
