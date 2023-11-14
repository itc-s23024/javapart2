package exercise;

public class E751 {
    public static void main(String[] args) {
        Product p = new Product(
                890,
                280,
                "ステンレスネジ"
        );
        Stock s890 = new Stock(p, 10);
        System.out.println(s890);

        p.setNumber(810);
        s890.getProduct().setNumber(900);

        System.out.println(s890);
    }
}
