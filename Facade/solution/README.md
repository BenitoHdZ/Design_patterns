
# Solución - Facade

## Cambios principales
- Se creó `VideoConversionFacade` como punto de acceso único.
- Se redujo la complejidad para el cliente.

## Código
```java
class Codec {}
class VideoFile {}
class AudioMixer {}
class VideoConverter {
    void decode() { System.out.println("Decodificando..."); }
    void mixAudio() { System.out.println("Mezclando audio..."); }
    void export(String format){ System.out.println("Exportando a " + format); }
}

class VideoConversionFacade {
    private VideoConverter converter = new VideoConverter();
    public void convert(String filename, String format){
        System.out.println("Iniciando conversión de " + filename);
        converter.decode();
        converter.mixAudio();
        converter.export(format);
        System.out.println("Conversión completada.");
    }
}

public class Main {
    public static void main(String[] args){
        VideoConversionFacade facade = new VideoConversionFacade();
        facade.convert("video.avi", "mp4");
    }
}
Salida esperada:

Iniciando conversión de video.avi
Decodificando...
Mezclando audio...
Exportando a mp4
Conversión completada.

Extensión

Permite registrar logs o medir tiempo en la fachada.

Agrega compatibilidad con nuevos formatos sin modificar Main.