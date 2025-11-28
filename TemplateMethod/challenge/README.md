# Challenge - Patrón Template Method

## Instrucciones de refactorización
Refactoriza el código para eliminar duplicación entre diferentes tipos de reportes, definiendo un flujo general común en una clase abstracta.

### Código base
```java
public class Main {
    public static void main(String[] args) {
        ReportePDF pdf = new ReportePDF();
        pdf.generar();

        ReporteExcel excel = new ReporteExcel();
        excel.generar();
    }
}

class ReportePDF {
    public void generar() {
        System.out.println("Cargando datos desde BD...");
        System.out.println("Formateando datos para PDF...");
        System.out.println("Exportando reporte en PDF...");
    }
}

class ReporteExcel {
    public void generar() {
        System.out.println("Cargando datos desde BD...");
        System.out.println("Formateando datos para Excel...");
        System.out.println("Exportando reporte en Excel...");
    }
}

💡 Tips de implementación

Identifica los pasos comunes y los que cambian entre reportes.

Crea una clase abstracta Reporte con un método generar() final.

Declara los pasos variables como métodos abstractos (formatearDatos, exportar).

Usa plantillas de método para forzar un orden lógico en el proceso.

Aplica el principio Hollywood ("No nos llames, nosotros te llamamos").