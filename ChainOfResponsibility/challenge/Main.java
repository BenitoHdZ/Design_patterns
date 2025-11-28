public class Main {
    public static void main(String[] args) {
        AuthSystem auth = new AuthSystem();
        auth.handleRequest("login");
        auth.handleRequest("log");
        auth.handleRequest("error");
    }
}