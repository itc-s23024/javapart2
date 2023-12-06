package chapter11_1;

import chapter10_2.Rate1;
import chapter10_2.Tax;

public class Sample1 {
    public static void main(String[] args) {

        chapter10_2.Tax tax = new Tax(100, "田中宏", 150);
        int zei = tax.zeigaku(gaku -> gaku>100 ? 0.1 : 0.05);
        System.out.println(tax.getName() + " " + zei);
    }
}
