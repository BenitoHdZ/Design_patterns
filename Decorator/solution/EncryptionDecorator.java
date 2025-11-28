class EncryptionDecorator extends ReportDecorator {
    public EncryptionDecorator(Report r) { super(r); }
    public String generate() { return "Cifrado -> " + wrappee.generate(); }
}