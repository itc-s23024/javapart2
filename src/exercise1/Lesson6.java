package exercise1;

import java.util.HashMap;

public class Lesson6 {
    public static void main(String[] args) {
        //空のMapを作る
        //キーは文字列型, 値は少数型
        //キー:沖縄の観光名所
        //値は：おすすめ度(0~5.0)
        //その値を追加してください(5つ)
        //すべて表示する
        var okinawa = new HashMap<String, Double>();
        okinawa.put("首里城", 4.0);
        okinawa.put("国際通り", 4.7);
        okinawa.put("平和の礎", 3.9);
        okinawa.put("美ら海水族館", 5.0);
        okinawa.put("アウトレットモールあしびなー", 4.5);

        okinawa.forEach((o,k) -> System.out.println(o + " " + k));
    }
}
