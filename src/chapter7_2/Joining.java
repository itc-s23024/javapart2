package chapter7_2;

public class Joining {
    private String csv;
    private String delimiter;

    public Joining(String csv, String delimiter) {
        this.csv = csv;
        this.delimiter = delimiter;
    }

    public Joining(String delimiter) {
        this.csv = "";
        this.delimiter = delimiter;
    }

    public Joining() {
        this.csv = "";
        this.delimiter = ",";
    }

    public void add(String s) {
        csv += csv.isEmpty() ? s : delimiter + s;
    }

    public String getCsv() {
        return csv;
    }
}

