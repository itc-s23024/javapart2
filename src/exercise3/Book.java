package exercise3;

import java.util.ArrayList;

public class Book {

    private String title;
    private String author;
    private int price;
    //すべての本のオブジェクトを格納するフィールド追加
    //book型のリストを作りたい
    //そして、そのリストに追加できるメソッドがほしい
    ArrayList<Book> bookCollection;

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.bookCollection = new ArrayList<>();
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void addBook(Book book){
        bookCollection.add(book);
    }

    public ArrayList<Book> getBookCollection() {
        return bookCollection;
    }

}