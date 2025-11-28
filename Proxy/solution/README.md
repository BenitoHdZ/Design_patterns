# Solución - Proxy

## Cambios principales
- Se implementó `ProxyImage` que instancia `RealImage` bajo demanda.
- Se mantiene interfaz común `Image`.

## Código
```java
interface Image {
    void display();
}

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

class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;
    public ProxyImage(String filename){ this.filename = filename; }

    public void display(){
        if(realImage == null){
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}

public class Main {
    public static void main(String[] args){
        Image img = new ProxyImage("foto1.png");
        img.display();
        img.display();
    }
}

Salida esperada:
Cargando foto1.png
Mostrando foto1.png
Mostrando foto1.png

Extension:
Agrega un proxy de control de acceso o caché de miniaturas.