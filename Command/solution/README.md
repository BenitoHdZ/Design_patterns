
# Solución - Patrón Command

## Cambios principales
- Se encapsularon las acciones en objetos comando.  
- El control remoto ejecuta comandos sin conocer sus detalles.  
- Código desacoplado y fácilmente extensible.

### Código completo
```java
interface Comando {
    void ejecutar();
}

class Luz {
    public void encender() {
        System.out.println("La luz está encendida");
    }

    public void apagar() {
        System.out.println("La luz está apagada");
    }
}

class EncenderLuz implements Comando {
    private Luz luz;
    public EncenderLuz(Luz luz) { this.luz = luz; }
    public void ejecutar() { luz.encender(); }
}

class ApagarLuz implements Comando {
    private Luz luz;
    public ApagarLuz(Luz luz) { this.luz = luz; }
    public void ejecutar() { luz.apagar(); }
}

class ControlRemoto {
    private Comando comando;
    public void setComando(Comando comando) { this.comando = comando; }
    public void presionarBoton() { comando.ejecutar(); }
}

public class Main {
    public static void main(String[] args) {
        Luz luz = new Luz();
        ControlRemoto control = new ControlRemoto();

        control.setComando(new EncenderLuz(luz));
        control.presionarBoton();

        control.setComando(new ApagarLuz(luz));
        control.presionarBoton();
    }
}

Salida esperada:
La luz está encendida
La luz está apagada

Cómo extender la funcionalidad

Crea nuevos comandos (SubirVolumen, AbrirPuerta, ReproducirMúsica).

Implementa una pila de comandos para deshacer/rehacer.

Usa un macro comando para ejecutar varias acciones en secuencia.
