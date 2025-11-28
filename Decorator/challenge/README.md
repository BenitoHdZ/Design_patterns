# Challenge - Patrón Decorator

## Instrucciones de refactorización
Refactoriza el siguiente código para permitir agregar dinámicamente compresión y cifrado a los reportes sin modificar las clases base.

## Código a modificar
```java
interface Report {
    String generate();
}

class SimpleReport implements Report {
    public String generate() {
        return "Reporte generado";
    }
}

class CompressedReport implements Report {
    public String generate() {
        // Código duplicado...
        return "Reporte comprimido: " + new SimpleReport().generate();
    }
}

class EncryptedReport implements Report {
    public String generate() {
        // Código duplicado...
        return "Reporte cifrado: " + new SimpleReport().generate();
    }
}

public class Main {
    public static void main(String[] args) {
        Report r = new CompressedReport();
        System.out.println(r.generate());
    }
}

Tips de implementación

¿Qué pasaría si quisieras combinar ambos comportamientos (cifrar y comprimir)?

Piensa en aplicar composición sobre herencia.

Usa una interfaz común y una clase decoradora base.

Reflexiona sobre cómo aplicar el principio OCP.