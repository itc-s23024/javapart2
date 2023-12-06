package chapter11_2;

import java.util.function.Predicate;

// 引数numberの値が18歳以上ならtrue,それ以外はfalseと出力

public class PredExample {
    public static void main(String[] args) {

        boolean result = /* 1 */

        System.out.print(result);
    }

    public static boolean pred(int number, Predicate<Integer> pr){
        /* 2 */
    }
}
