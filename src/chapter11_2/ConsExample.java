package chapter11_2;
import java.util.function.Consumer;

public class ConsExample {
    public static void main(String[] args) {

        //Consumerインターフェースのacceptメソッド使い
        //引数の値を出力する
        //Consumer<String> c = a -> System.out.println(a);
        Consumer<String> c = System.out::println;
        c.accept("Hello");

    }
}
