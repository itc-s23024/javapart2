package chapter7_6;

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

    public static void main(String[] args) {
        Joining j = new Joining("", ",");

        j.add("apple");
        j.add("banana");
        j.add("peach");
        System.out.println(j.getCsv());
        System.out.println(j.csv);
        System.out.println(j.delimiter);
    }
}

