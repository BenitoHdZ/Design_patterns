class FileLeaf implements Component {
    String name;
    FileLeaf(String n){ name = n; }
    public void show(){ System.out.println("Archivo: " + name); }
}