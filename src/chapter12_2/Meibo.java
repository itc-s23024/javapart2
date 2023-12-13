package chapter12_2;

public record Meibo(int number, String name) implements Comparable<Meibo> {


    @Override
    public int compareTo(Meibo o) {
        return Integer.compare(number, o.number);
    }
}

