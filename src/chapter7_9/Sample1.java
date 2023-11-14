package chapter7_9;

public class Sample1 {
    public static void main(String[] args) {
        Id id = new Id(100, "田中宏");
        Tax tax = new Tax(id, 300000, 100000);
        System.out.println(tax);

       tax.getId().setNumber(200);
        id.setNumber(200);
        System.out.println(tax);
    }
}
