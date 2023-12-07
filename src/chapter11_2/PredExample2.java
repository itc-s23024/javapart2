package chapter11_2;
import java.util.function.Predicate;
public class PredExample2 {
    public static void main(String[] args) {

        //Predicateインターフェースのtestメソッドを使う
        //外部変数words文字列 "apple banana cherry peach"
        //引数の文字列がwords内に存在するかどうか？を返す

        String words = "apple banana cherry peach";
        Predicate<String> p = words::contains;
        System.out.println(p.test("apple"));

    }
}
