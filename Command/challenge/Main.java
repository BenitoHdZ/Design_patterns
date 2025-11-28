public class Main {
    public static void main(String[] args) {
        Luz luz = new Luz();
        ControlRemoto control = new ControlRemoto(luz);
        control.presionarBoton("on");
        control.presionarBoton("off");
    }
}