class RemoteControl {
    private Command command;
    void setCommand(Command c){ command = c; }
    void pressButton(){ command.execute(); }
}