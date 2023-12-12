package chapter12;

public class Movie {
    //フィールド名　タイトル：String　興行収入：double　製作年:int
    private String title;
    private double revenue;
    private int year;

    public Movie(String title, double revenue, int year) {
        this.title = title;
        this.revenue = revenue;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public double getRevenue() {
        return revenue;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", revenue=" + revenue +
                ", year=" + year +
                '}';
    }
}
