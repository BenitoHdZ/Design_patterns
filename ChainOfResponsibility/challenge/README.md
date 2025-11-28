## Refactoriza este código aplicando el patrón Chain of Responsibility.

## Código a modificar
```java

public class Main {
    public static void main(String[] args) {
        AuthSystem auth = new AuthSystem();
        auth.handleRequest("login");
        auth.handleRequest("log");
        auth.handleRequest("error");
    }
}

class AuthSystem {
    public void handleRequest(String request) {
        if (request.equals("login")) {
            System.out.println("Usuario autenticado");
        } else if (request.equals("log")) {
            System.out.println("Guardando log de la acción");
        } else if (request.equals("error")) {
            System.out.println("Mostrando mensaje de error");
        } else {
            System.out.println("Solicitud desconocida");
        }
    }
}

Reto: refactoriza para que cada tipo de solicitud sea manejado por un objeto diferente (Handler), que delegue al siguiente en la cadena.

Tips de implementación

¿Qué ocurriría si quisieras agregar un nuevo tipo de solicitud sin modificar el código actual?

Crea una clase abstracta Handler que contenga una referencia al siguiente manejador.

Cada manejador decide si procesa la solicitud o la delega.

Aplica el principio Open/Closed para permitir nuevas responsabilidades sin cambiar las existentes.

Piensa en una cadena flexible que pueda reorganizarse dinámicamente.