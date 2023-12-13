package chapter12_2;

import java.util.TreeSet;

public class Sample3 {
    public static void main(String[] args) {

        var set = new TreeSet<Meibo>();
        set.add(new Meibo(300,"田中宏"));
        set.add(new Meibo(100,"木村正一"));
        set.add(new Meibo(200,"佐藤修"));

        set.forEach(System.out::println);
    }
}
