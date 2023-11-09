package exercise;

import chapter7_2.Joining;

public class E721_1 {
    public static void main(String[] args) {
        Joining j1 = new Joining( "-");
        j1.add("apple");
        j1.add("banana");
        j1.add("peach");
        System.out.println(j1.getCsv());
    }
}
