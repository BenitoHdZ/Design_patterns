class ErrorHandler extends Handler {
    protected boolean process(String r) {
        if (r.equals("error")) {
            System.out.println("Mostrando mensaje de error");
            return true;
        }
        return false;
    }
}