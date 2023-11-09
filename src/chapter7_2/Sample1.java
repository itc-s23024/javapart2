package chapter7_2;

public class Sample1 {
    public static void main(String[] args) {
        Joining j = new Joining("", ",");
        j.add("apple");
        j.add("banana");
        j.add("peach");
        System.out.println(j.getCsv());

        Joining j2 = new Joining( ",");
        j2.add("apple");
        j2.add("banana");
        j2.add("peach");
        System.out.println(j2.getCsv());

        Joining j3 = new Joining();
        j3.add("apple");
        j3.add("banana");
        j3.add("cherry");
        System.out.println(j3.getCsv());

    }
}
