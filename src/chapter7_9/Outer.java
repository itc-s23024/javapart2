package chapter7_9;

public class Outer {
    private int number;

    public Outer(int number) {
        this.number = number;
    }

    public void print() {
        Inner inner = new Inner();
        System.out.println(inner.msg());
    }

    private class Inner {
        public String msg() {
            return "number is " + number;
        }
    }
}
