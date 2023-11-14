package exercise;

public class Product {
    private int number;     //商品番号
    private int price;      //価格
    private String name;    //商品名

    public Product(int number, int price, String name) {
        this.number = number;
        this.price = price;
        this.name = name;
    }

    public Product(Product src) {
        this.number = src.number;
        this.price = src.price;
        this.name = src.name;
    }
    public int getNumber() {
        return number;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "number=" + number +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
