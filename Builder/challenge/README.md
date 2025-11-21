# Reto (Builder)

## Instrucciones

Refactoriza el código para evitar el uso de **constructores telescópicos** y reducir el acoplamiento entre la lógica de creación y la clase `Report`.  
Implementa el patrón **Builder** de manera que:

- La construcción del objeto `Report` pueda hacerse **paso a paso**.
- Puedas agregar nuevas secciones (gráficos, tablas, metadatos, etc.) **sin modificar el constructor** de `Report`.
- La construcción sea clara, flexible y extensible, aplicando el principio **abierto/cerrado**.

Tu solución debe permitir crear múltiples configuraciones de `Report` (simple, detallado, completo, etc.) de forma legible y sin necesidad de crear un constructor para cada combinación posible.

---

## Código a Refactorizar

**Archivo: `challenge/Report.java`**
```java
package builder.challenge;

public class Report {
    private String header;
    private String table;
    private String chart;
    private String footer;

    // Constructor telescópico
    public Report(String header) {
        this.header = header;
    }

    public Report(String header, String table) {
        this.header = header;
        this.table = table;
    }

    public Report(String header, String table, String chart) {
        this.header = header;
        this.table = table;
        this.chart = chart;
    }

    public Report(String header, String table, String chart, String footer) {
        this.header = header;
        this.table = table;
        this.chart = chart;
        this.footer = footer;
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

**Archivo: `challenge/Main.java`**
```java

package builder.challenge;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Creando un reporte con el constructor telescópico ===");

        Report report = new Report(
                "Resumen del Q4",
                "Tabla de ventas por región",
                "Gráfico de barras",
                "Confidencial"
        );

        System.out.println(report);

        System.out.println("\n=== Problema ===");
        System.out.println("¿Qué pasa si quieres agregar una nueva sección como 'metadatos'?");
        System.out.println("¿Tendrías que crear otro constructor?");
        System.out.println("¿Y si quisieras un reporte simple con solo encabezado y pie?");
        System.out.println("¿O un reporte detallado con varias secciones opcionales?");

        System.out.println("\n=== Objetivo del reto ===");
        System.out.println("Refactoriza este código usando el patrón Builder.");
    }
}
