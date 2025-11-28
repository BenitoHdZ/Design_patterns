```md
# Challenge - Patrón Command

## Instrucciones de refactorización
Refactoriza el código para encapsular las acciones (encender/apagar luz) en comandos independientes.

### Código base
```java
public class Main {
    public static void main(String[] args) {
        Luz luz = new Luz();
        ControlRemoto control = new ControlRemoto(luz);
        control.presionarBoton("on");
        control.presionarBoton("off");
    }
}

class Luz {
    public void encender() {
        System.out.println("La luz está encendida");
    }

    public void apagar() {
        System.out.println("La luz está apagada");
    }
}

class ControlRemoto {
    private Luz luz;

    public ControlRemoto(Luz luz) {
        this.luz = luz;
    }

    public void presionarBoton(String accion) {
        if (accion.equals("on")) {
            luz.encender();
        } else if (accion.equals("off")) {
            luz.apagar();
        }
    }
}

Tips de implementación

Crea una interfaz Comando con el método execute().

Implementa clases EncenderLuz y ApagarLuz que encapsulen la acción.

Haz que ControlRemoto reciba el comando dinámicamente.

Piensa cómo podrías deshacer una acción (hint: patrón Command lo permite).

Aplica el principio Open/Closed para nuevos dispositivos sin cambiar el control.
