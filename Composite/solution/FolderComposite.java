import java.util.ArrayList;
import java.util.List;

class FolderComposite implements Component {
    String name;
    List<Component> children = new ArrayList<>();
    FolderComposite(String n){ name = n; }
    void add(Component c){ children.add(c); }
    public void show(){
        System.out.println("Carpeta: " + name);
        for(Component c : children) c.show();
    }
}