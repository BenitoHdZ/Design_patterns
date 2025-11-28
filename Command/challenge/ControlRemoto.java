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