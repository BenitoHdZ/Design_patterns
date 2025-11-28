# Challenge - Facade

## Código a modificar
```java
class Codec {}
class VideoFile {}
class AudioMixer {}

class VideoConverter {
    public void convertVideo(String filename, String format) {
        // Simulación: múltiples pasos técnicos...
        System.out.println("Cargando " + filename);
        System.out.println("Decodificando...");
        System.out.println("Mezclando audio...");
        System.out.println("Exportando a " + format);
    }
}

Instrucciones

Crea una clase Facade (VideoConversionFacade) que encapsule la complejidad.

Simplifica el uso desde Main.

Tips

Piensa en abstracción y en cómo reducir dependencias.

Considera el principio de inversión de dependencias.