package chapter12;

public class Book implements Comparable<Book> {
    private String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Book o) {
        return name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
