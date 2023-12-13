package chapter12_2;

import java.util.LinkedHashSet;

public class Sample2 {
    public static void main(String[] args) {

        var set = new LinkedHashSet<>();
        set.add(new Meibo(300,"田中宏"));
        set.add(new Meibo(100,"木村正一"));
        set.add(new Meibo(200,"佐藤修"));

        set.forEach(System.out::println);
    }
}
