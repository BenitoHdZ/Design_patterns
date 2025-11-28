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