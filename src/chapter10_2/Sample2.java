package chapter10_2;

public class Sample2 {
    public static void main(String[] args) {
        Tax tax = new Tax(100, "田中宏", 150);
        int zei = tax.zeigaku(new Rate2());
        System.out.println(tax.getName() + "\t" + zei);
    }
}
