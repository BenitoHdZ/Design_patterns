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
