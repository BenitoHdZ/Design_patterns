abstract class ReportDecorator implements Report {
    protected Report wrappee;
    public ReportDecorator(Report r) { this.wrappee = r; }
}