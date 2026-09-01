package dosw.semana_4.templateMethodFactoryMethodEjercicio03;

public class ExcelReport extends ReportGenerator {

    @Override
    protected void applyFormat() {
        System.out.println("[EXCEL] Aplicando formato con celdas, hojas y formulas...");
    }

    @Override
    protected void exportFile() {
        System.out.println("[EXCEL] Exportando archivo: reporte.xlsx");
    }
}
