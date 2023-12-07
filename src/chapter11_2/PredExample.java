package chapter11_2;

import java.util.function.Predicate;

// 引数numberの値が18歳以上ならtrue,それ以外はfalseと出力

public class PredExample {
    public static void main(String[] args) {

//        boolean result = pred(20, (i) -> (i >= 10));
//        System.out.print(result);

        Predicate<Integer> pr = a -> (a >= 18);
        System.out.println(pr.test(10));
    }

//    public static boolean pred(int number, Predicate<Integer> pr){
//        return pr.test(number);
//    }
}
