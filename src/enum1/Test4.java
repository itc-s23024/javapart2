package enum1;

public class Test4 {
    public static void main(String[] args) {
        Book book = new Book(Genre.CULTURE, "日本の祭り", "斎藤孝雄");
        System.out.println(book);
    }
}

enum Genre{
    LITERATURE,
    SCIENCE,
    CULTURE
}

record Book (Genre genre, String title, String author){}
