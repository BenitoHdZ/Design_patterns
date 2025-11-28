package solution;

public class Report {

    private final String title;
    private final String content;
    private final String footer;
    private final String author;
    private final String date;
    private final int pages;
    private final boolean watermark;
    private final String format;

    private Report(Builder builder) {
        this.title = builder.title;
        this.content = builder.content;
        this.footer = builder.footer;
        this.author = builder.author;
        this.date = builder.date;
        this.pages = builder.pages;
        this.watermark = builder.watermark;
        this.format = builder.format;
    }

    public static class Builder {
        private String title;
        private String content;
        private String footer;
        private String author;
        private String date;
        private int pages;
        private boolean watermark;
        private String format;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setFooter(String footer) {
            this.footer = footer;
            return this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setPages(int pages) {
            this.pages = pages;
            return this;
        }

        public Builder enableWatermark(boolean watermark) {
            this.watermark = watermark;
            return this;
        }

        public Builder setFormat(String format) {
            this.format = format;
            return this;
        }

        public Report build() {
            return new Report(this);
        }
    }

        public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getFooter() {
        return footer;
    }

    public String getAuthor() {
        return author;
    }

    public String getDate() {
        return date;
    }

    public int getPages() {
        return pages;
    }

    public boolean isWatermark() {
        return watermark;
    }

    public String getFormat() {
        return format;
    }
}
