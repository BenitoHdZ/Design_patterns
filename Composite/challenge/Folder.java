import java.util.ArrayList;
import java.util.List;

class Folder {
    String name;
    List<File> files = new ArrayList<>();
    Folder(String n){ name = n; }
    void add(File f){ files.add(f); }
    void show(){
        System.out.println("Carpeta: " + name);
        for(File f : files) f.show();
    }
}
