class LogHandler extends Handler {
    protected boolean process(String r) {
        if (r.equals("log")) {
            System.out.println("Guardando log de la acción");
            return true;
        }
        return false;
    }
}