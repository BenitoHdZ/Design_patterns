# Challenge - Composite

## Código a modificar
```java
class File {
    String name;
    File(String n){ name = n; }
    void show(){ System.out.println(name); }
}

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

Instrucciones

Refactoriza para permitir que una carpeta contenga otras carpetas.

Aplica una interfaz común Component con un método show().

Usa recursividad para imprimir toda la jerarquía.

Tips

¿Qué patrón te ayuda a tratar hojas y compuestos igual?

Revisa el principio LSP.