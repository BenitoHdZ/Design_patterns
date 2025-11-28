package challenge;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Challenge: Construction with a telescopic constructor ===");

        Report report = new Report(
            "Sales Report",
            "Content of the report...",
            "Footer: Confidential",
            "John Doe",
            "2025-01-15",
            45,
            true,
            "PDF"
        );

        System.out.println("Report created using a long constructor!");
        System.out.println("Title: " + report.getTitle());
        System.out.println("Pages: " + report.getPages());
        System.out.println("Format: " + report.getFormat());

        System.out.println("\n=== PROBLEM ===");
        System.out.println("1. Hard to read.");
        System.out.println("2. Easy to confuse parameters.");
        System.out.println("3. No flexibility for optional fields.");
        System.out.println("4. Violates SRP and OCP.");
        System.out.println("5. Adding new attributes requires modifying constructor.");
    }
}
