# Solución - Patrón Chain of Responsibility

## Cambios principales realizados
- Se reemplazaron los condicionales por una jerarquía de manejadores.  
- Cada `Handler` maneja un tipo de solicitud o delega al siguiente.  
- Se implementó un flujo flexible y extensible.

### Código completo
```java
abstract class Handler {
    private Handler next;

    public Handler setNext(Handler next) {
        this.next = next;
        return next;
    }

    public void handle(String request) {
        if (!process(request) && next != null)
            next.handle(request);
    }

    protected abstract boolean process(String request);
}

class LoginHandler extends Handler {
    protected boolean process(String r) {
        if (r.equals("login")) {
            System.out.println("Usuario autenticado");
            return true;
        }
        return false;
    }
}

class LogHandler extends Handler {
    protected boolean process(String r) {
        if (r.equals("log")) {
            System.out.println("Guardando log de la acción");
            return true;
        }
        return false;
    }
}

class ErrorHandler extends Handler {
    protected boolean process(String r) {
        if (r.equals("error")) {
            System.out.println("Mostrando mensaje de error");
            return true;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Handler login = new LoginHandler();
        Handler log = new LogHandler();
        Handler error = new ErrorHandler();

        login.setNext(log).setNext(error);

        login.handle("login");
        login.handle("log");
        login.handle("error");
        login.handle("otra");
    }
}

Salida esperada:
Usuario autenticado
Guardando log de la acción
Mostrando mensaje de error

Cómo extender la funcionalidad

Crea un nuevo Handler para otro tipo de evento (por ejemplo, SecurityHandler).

Cambia el orden de la cadena sin modificar las clases existentes.

Permite leer la configuración de la cadena desde un archivo externo.