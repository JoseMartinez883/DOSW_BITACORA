package dosw.semana_4.templateMethodFactoryMethodEjercicio03;

public class Main {

    public static void main(String[] args) {

        System.out.println("=== Reporte PDF ===");
        ReportGenerator pdfReport = ReportFactory.create("PDF");
        pdfReport.generate();

        System.out.println("\n=== Reporte Excel ===");
        ReportGenerator excelReport = ReportFactory.create("EXCEL");
        excelReport.generate();

        System.out.println("\n=== Reporte CSV ===");
        ReportGenerator csvReport = ReportFactory.create("CSV");
        csvReport.generate();
    }
}
