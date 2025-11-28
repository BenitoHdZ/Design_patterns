# Challenge - Proxy

## Código a modificar
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

public class Main {
    public static void main(String[] args){
        Image img = new RealImage("foto1.png");
        img.display();
        img.display();
    }
}

Instrucciones

Crea una clase ProxyImage que cargue la imagen solo cuando sea necesario.

Mantén la interfaz Image.

Usa lazy loading.

Tips

Piensa en delegación.

¿Cuándo instanciarías el objeto real?