class LoginHandler extends Handler {
    protected boolean process(String r) {
        if (r.equals("login")) {
            System.out.println("Usuario autenticado");
            return true;
        }
        return false;
    }
}