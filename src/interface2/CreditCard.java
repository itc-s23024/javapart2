package interface2;

public class CreditCard implements PaymentStrategy{
    @Override
    public void processPayment() {
        System.out.println("クレジットカード番号を入力してください");
    }

    @Override
    public String getName() {
        return "クレジットカード";
    }


}
