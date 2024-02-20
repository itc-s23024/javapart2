package interface2;

public class Cash implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("現金を入れてください");
    }

    @Override
    public String getName() {
        return "現金";
    }
}
