class RealImage implements Image {
    private String filename;
    public RealImage(String filename){
        this.filename = filename;
        loadFromDisk();
    }
    private void loadFromDisk(){
        System.out.println("Cargando " + filename);
    }
    public void display(){
        System.out.println("Mostrando " + filename);
    }
}