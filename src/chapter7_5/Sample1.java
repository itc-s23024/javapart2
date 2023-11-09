package chapter7_5;

public class Sample1 {
    public static void main(String[] args) {
        StaticJoining.init("", ",");

        StaticJoining.add("apple");
        StaticJoining.add("banana");
        StaticJoining.add("peach");
        System.out.println(StaticJoining.getCsv());
    }
}
