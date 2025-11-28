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