package solution;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Solution: Construction using Builder Pattern ===");

        Report report = new Report.Builder()
            .setTitle("Sales Report")
            .setContent("Content of the report...")
            .setFooter("Footer: Confidential")
            .setAuthor("John Doe")
            .setDate("2025-01-15")
            .setPages(45)
            .enableWatermark(true)
            .setFormat("PDF")
            .build();

        System.out.println("Report successfully created using Builder!");
        System.out.println("Title: " + report.getTitle());
        System.out.println("Pages: " + report.getPages());
        System.out.println("Format: " + report.getFormat());

        System.out.println("\n=== ADVANTAGES ===");
        System.out.println("1. Readable and fluent construction.");
        System.out.println("2. Optional fields handled naturally.");
        System.out.println("3. Easy to add new features (OCP).");
        System.out.println("4. Report is immutable.");
        System.out.println("5. Builder has SRP (only builds).");

        System.out.println("\n=== Extending without modifying ===");
        System.out.println("To add digital signatures, just add:");
        System.out.println("  builder.setDigitalSignature(...)");
        System.out.println("No need to modify the Report constructor!");
    }
}
