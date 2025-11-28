# Solución (Builder)

⚠️ **Intenta resolver el reto antes de ver la solución**

## Cambios Principales

1. **Constructor privado en `Report`**  
   Se eliminan los constructores telescópicos y se impide la creación directa del objeto.  
   El objeto solo puede construirse mediante el Builder, evitando combinaciones inconsistentes.

2. **Separación entre construcción y representación**  
   La clase `Report` ya no conoce la lógica de ensamblaje, solo recibe valores ya preparados.  
   Esto reduce el acoplamiento y mejora la claridad del código.

3. **Extensibilidad sin modificar `Report`**  
   `Report` no necesita nuevos constructores ni cambios internos.

4. **Validación centralizada en `build()`**  
   El Builder puede imponer reglas (como requerir un encabezado obligatorio) antes de construir el objeto final.

---

## Código Refactorizado

### Archivo: `Report.java`

```java
package builder.solution;

public class Report {
    private final String title;
    private final String content;
    private final String footer;
    private final String author;
    private final String date;
    private final int pages;
    private final boolean watermark;
    private final String format;

    private Report(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.footer = builder.footer;
        this.author = builder.author;
        this.date = builder.date;
        this.pages = builder.pages;
        this.watermark = builder.watermark;
        this.format = builder.format;
    }

    public static class Builder {
        private String title;
        private String content;
        private String footer;
        private String author;
        private String date;
        private int pages;
        private boolean watermark;
        private String format;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setFooter(String footer) {
            this.footer = footer;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setPages(int pages) {
            this.pages = pages;
            return this;
        }

        public Builder enableWatermark(boolean watermark) {
            this.watermark = watermark;
            return this;
        }

        public Builder setFormat(String format) {
            this.format = format;
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }
}

### Archivo Main.java

package builder.solution;

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