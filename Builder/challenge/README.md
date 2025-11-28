# Reto (Builder)

## Instrucciones

Refactoriza el código para evitar el uso de **constructores telescópicos** y reducir el acoplamiento entre la lógica de creación y la clase `Report`.  
Implementa el patrón **Builder** de manera que:

- La construcción del objeto `Report` pueda hacerse **paso a paso**.
- Puedas agregar nuevas secciones (gráficos, tablas, metadatos, etc.) **sin modificar el constructor** de `Report`.
- La construcción sea clara, flexible y extensible, aplicando el principio **abierto/cerrado**.

Tu solución debe permitir crear múltiples configuraciones de `Report` (simple, detallado, completo, etc.) de forma legible y sin necesidad de crear un constructor para cada combinación posible.

---

## Código a Refactorizar

**Archivo: `challenge/Report.java`**
```java
package challenge;

public class Report {
    private String title;
    private String content;
    private String footer;
    private String author;
    private String date;
    private int pages;
    private boolean watermark;
    private String format;

    public Report(String title, String content, String footer, String author, String date, int pages, boolean watermark, String format) {
        this.title = title;
        this.content = content;
        this.footer = footer;
        this.author = author;
        this.date = date;
        this.pages = pages;
        this.watermark = watermark;
        this.format = format;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isWatermark() {
        return watermark;
    }

    public void setWatermark(boolean watermark) {
        this.watermark = watermark;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}

TIPS

¿Qué tan fácil es entender qué representa cada parámetro cuando llamas al constructor?

¿Qué ocurre si cambias el orden de los parámetros al llamar al constructor?

¿Cuántos parámetros son realmente obligatorios y cuántos son opcionales?

¿Es cómodo agregar un nuevo atributo al reporte con la estructura actual?

¿Qué tan probable es cometer errores al usar este constructor largo?
