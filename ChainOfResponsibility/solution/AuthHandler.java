class AuthHandler extends Handler {
    protected boolean process(String r){
        if(r.equals("auth")){ System.out.println("Autenticado"); return true; }
        return false;
    }
}