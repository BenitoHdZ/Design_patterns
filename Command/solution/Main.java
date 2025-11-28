public class Main {
    public static void main(String[] args){
        Light l = new Light();
        Command on = new LightOnCommand(l);
        RemoteControl rc = new RemoteControl();
        rc.setCommand(on);
        rc.pressButton();
    }
}