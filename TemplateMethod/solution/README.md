# Solución - Patrón Template Method

## Cambios principales
- Se creó una clase abstracta `Reporte` que define el flujo general.  
- Las subclases implementan los pasos específicos del formato.  
- Se eliminó duplicación de código y se estandarizó el proceso.

### Código completo
```java
abstract class Reporte {
    // Método plantilla
    public final void generar() {
        cargarDatos();
        formatearDatos();
        exportar();
    }

    protected void cargarDatos() {
        System.out.println("Cargando datos desde BD...");
    }

    protected abstract void formatearDatos();
    protected abstract void exportar();
}

class ReportePDF extends Reporte {
    protected void formatearDatos() {
        System.out.println("Formateando datos para PDF...");
    }

    protected void exportar() {
        System.out.println("Exportando reporte en PDF...");
    }
}

class ReporteExcel extends Reporte {
    protected void formatearDatos() {
        System.out.println("Formateando datos para Excel...");
    }

    protected void exportar() {
        System.out.println("Exportando reporte en Excel...");
    }
}

public class Main {
    public static void main(String[] args) {
        new ReportePDF().generar();
        new ReporteExcel().generar();
    }
}

Salida esperada:
Cargando datos desde BD...
Formateando datos para PDF...
Exportando reporte en PDF...
Cargando datos desde BD...
Formateando datos para Excel...
Exportando reporte en Excel...

Cómo extender la funcionalidad

Agrega nuevos tipos de reportes (ReporteHTML, ReporteCSV).

Inserta pasos opcionales mediante hooks (métodos con implementación vacía).

Cambia el origen de datos sin alterar la estructura del flujo general.
