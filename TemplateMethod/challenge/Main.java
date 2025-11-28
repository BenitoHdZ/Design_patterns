public class Main {
    public static void main(String[] args) {
        ReportePDF pdf = new ReportePDF();
        pdf.generar();

        ReporteExcel excel = new ReporteExcel();
        excel.generar();
    }
}