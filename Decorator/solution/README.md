
### `solution/README.md`
```md
# Solución - Patrón Decorator

## ⚠️ Advertencia
Asegúrate de intentar resolver el reto por tu cuenta antes de revisar esta solución.

## Cambios principales
- Se creó una clase `ReportDecorator` que implementa `Report`.
- Se eliminaron duplicaciones usando **delegación**.
- Se añadieron decoradores `CompressionDecorator` y `EncryptionDecorator`.

## Código resultante
```java
interface Report {
    String generate();
}

class SimpleReport implements Report {
    public String generate() {
        return "Reporte generado";
    }
}

abstract class ReportDecorator implements Report {
    protected Report wrappee;
    public ReportDecorator(Report r) { this.wrappee = r; }
}

class CompressionDecorator extends ReportDecorator {
    public CompressionDecorator(Report r) { super(r); }
    public String generate() { return "Comprimido -> " + wrappee.generate(); }
}

class EncryptionDecorator extends ReportDecorator {
    public EncryptionDecorator(Report r) { super(r); }
    public String generate() { return "Cifrado -> " + wrappee.generate(); }
}

public class Main {
    public static void main(String[] args) {
        Report report = new EncryptionDecorator(new CompressionDecorator(new SimpleReport()));
        System.out.println(report.generate());
    }
}

Salida esperada:
Cifrado -> Comprimido -> Reporte generado

###Como extender:
Agrega un DigitalSignatureDecorator.
Crea una cadena dinámica de decoradores desde configuración externa.