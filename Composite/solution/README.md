
### `solution/README.md`
```md
# Solución - Composite

## Cambios principales
- Se creó una interfaz `Component`.
- `FileLeaf` y `FolderComposite` implementan esa interfaz.
- `FolderComposite` maneja una lista de `Component`.

## Código
```java
interface Component {
    void show();
}

class FileLeaf implements Component {
    String name;
    FileLeaf(String n){ name = n; }
    public void show(){ System.out.println("Archivo: " + name); }
}

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

public class Main {
    public static void main(String[] args){
        FolderComposite root = new FolderComposite("root");
        FolderComposite docs = new FolderComposite("docs");
        docs.add(new FileLeaf("readme.txt"));
        root.add(docs);
        root.add(new FileLeaf("main.java"));
        root.show();
    }
}

Salida esperada:
Carpeta: root
Carpeta: docs
Archivo: readme.txt
Archivo: main.java

Extensión:
Agrega un método getSize() común.
Implementa búsqueda recursiva por nombre.