package builder.challenge;

public class Report {
    private String header;
    private String table;
    private String chart;
    private String footer;

    // Constructor telescópico
    public Report(String header) {
        this.header = header;
    }

    public Report(String header, String table) {
        this.header = header;
        this.table = table;
    }

    public Report(String header, String table, String chart) {
        this.header = header;
        this.table = table;
        this.chart = chart;
    }

    public Report(String header, String table, String chart, String footer) {
        this.header = header;
        this.table = table;
        this.chart = chart;
        this.footer = footer;
    }

    @Override
    public String toString() {
        return "Report{" +
                "header='" + header + '\'' +
                ", table='" + table + '\'' +
                ", chart='" + chart + '\'' +
                ", footer='" + footer + '\'' +
                '}';
    }
}