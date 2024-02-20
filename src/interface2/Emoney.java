package interface2;

public class Emoney implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("端末にかざしてください");
    }

    @Override
    public String getName() {
        return "電子マネー";
    }
}
