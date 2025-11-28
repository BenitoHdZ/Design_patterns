class EncryptedReport implements Report {
    public String generate() {
        // Código duplicado...
        return "Reporte cifrado: " + new SimpleReport().generate();
    }
}
