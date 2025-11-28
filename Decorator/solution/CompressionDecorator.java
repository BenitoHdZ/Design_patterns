class CompressionDecorator extends ReportDecorator {
    public CompressionDecorator(Report r) { super(r); }
    public String generate() { return "Comprimido -> " + wrappee.generate(); }
}