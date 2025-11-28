public class Main {
    public static void main(String[] args) {
        Report report = new EncryptionDecorator(new CompressionDecorator(new SimpleReport()));
        System.out.println(report.generate());
    }
}