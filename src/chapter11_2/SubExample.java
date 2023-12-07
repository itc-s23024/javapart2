package chapter11_2;
import java.util.function.Supplier;

public class SubExample {
    public static void main(String[] args) {
       // Supplier<Double> randomValue = () -> Math.random();
        Supplier<Double> randomValue = Math::random;
        System.out.println(randomValue.get());
    }
}
