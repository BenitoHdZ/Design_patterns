abstract class Reporte {
    // Método plantilla
    public final void generar() {
        cargarDatos();
        formatearDatos();
        exportar();
    }

    protected void cargarDatos() {
        System.out.println("Cargando datos desde BD...");
    }

    protected abstract void formatearDatos();
    protected abstract void exportar();
}