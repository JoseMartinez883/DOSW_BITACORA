package dosw.semana_4.templateMethodFactoryMethodEjercicio03;

public class PdfReport extends ReportGenerator {

    @Override
    protected void applyFormat() {
        System.out.println("[PDF] Aplicando formato PDF con tablas y graficos embebidos...");
    }

    @Override
    protected void exportFile() {
        System.out.println("[PDF] Exportando archivo: reporte.pdf");
    }
}
