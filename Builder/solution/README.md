# Solución (Builder)

⚠️ **Intenta resolver el reto antes de ver la solución**

## Cambios Principales

1. **Constructor privado en `Report`**  
   Se eliminan los constructores telescópicos y se impide la creación directa del objeto.  
   El objeto solo puede construirse mediante el Builder, evitando combinaciones inconsistentes.

2. **Clase interna `Report.Builder`**  
   Define todos los pasos opcionales (`addHeader()`, `addTable()`, `addChart()`, `addFooter()`) y un método final `build()`.  
   Cada método devuelve el Builder para permitir una API fluida.

3. **Separación entre construcción y representación**  
   La clase `Report` ya no conoce la lógica de ensamblaje, solo recibe valores ya preparados.  
   Esto reduce el acoplamiento y mejora la claridad del código.

4. **Extensibilidad sin modificar `Report`**  
   Nuevas secciones (por ejemplo, `addMetadata()`) se agregan únicamente al Builder, cumpliendo el principio abierto/cerrado.  
   `Report` no necesita nuevos constructores ni cambios internos.

5. **Validación centralizada en `build()`**  
   El Builder puede imponer reglas (como requerir un encabezado obligatorio) antes de construir el objeto final.

---

## Código Refactorizado

### Archivo: `Report.java`

```java
package builder.challenge;

public class Report {

    private String header;
    private String table;
    private String chart;
    private String footer;

    private Report() {} // Constructor privado

    public static class Builder {
        private String header;
        private String table;
        private String chart;
        private String footer;

        public Builder addHeader(String header) {
            this.header = header;
            return this;
        }

        public Builder addTable(String table) {
            this.table = table;
            return this;
        }

        public Builder addChart(String chart) {
            this.chart = chart;
            return this;
        }

        public Builder addFooter(String footer) {
            this.footer = footer;
            return this;
        }

        public Report build() {
            Report r = new Report();

            // Ejemplo de validación
            if (this.header == null) {
                throw new IllegalStateException("El reporte debe contener un encabezado.");
            }

            r.header = this.header;
            r.table = this.table;
            r.chart = this.chart;
            r.footer = this.footer;

            return r;
        }
    }

    @Override
    public String toString() {
        return "Report{" +
                "header='" + header + '\'' +
                ", table='" + table + '\'' +
                ", chart='" + chart + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }
}

### Archivo Main.java

package builder.challenge;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Creando reporte mediante Builder ===");

        Report report = new Report.Builder()
                .addHeader("Resumen del Q4")
                .addTable("Tabla de ventas por región")
                .addChart("Gráfico comparativo")
                .addFooter("Confidencial")
                .build();

        System.out.println(report);

        System.out.println("\n=== Creando un reporte simple ===");

        Report simple = new Report.Builder()
                .addHeader("Reporte Básico")
                .build();

        System.out.println(simple);

        System.out.println("\n=== Añadiendo una nueva sección opcional (Metadata) ===");
        System.out.println("Solo necesitarías agregar addMetadata() al Builder sin tocar Report.");
    }
}
