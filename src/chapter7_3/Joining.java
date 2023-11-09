package chapter7_3;

public class Joining {
    private String csv;
    private String delimiter;

    public Joining(String csv, String delimiter) {
        this.csv = csv;
        this.delimiter = delimiter;
    }

    public Joining(String delimiter) {
       this("", delimiter);
    }

    public Joining() {
        this("", ",");
    }

    public void add(String s) {
        csv += csv.isEmpty() ? s : delimiter + s;
    }

    public String getCsv() {
        return csv;
    }
}

