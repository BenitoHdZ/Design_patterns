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
