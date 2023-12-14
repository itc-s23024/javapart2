package exercise1;

import java.util.HashMap;

public class Exercise1241 {
    public static void main(String[] args) {

        //HashMapクラスを作る　キー :String　値:User
        var map = new HashMap<String, User>();

        //Userのインスタンスを作る　３名分
        User u1 = new User("ab123", "田中宏");
        User u2 = new User("ab224", "佐藤修");
        User u3 = new User("ac331", "木村正一");

        //そのインスタンスをマップに入れる
        //キー UserのID　　　値: Userインスタンス
        map.put("ab123", u1);
        map.put("ab224", u2);
        map.put("ac331", u3);

        //マップからキーがab224の値を表示する
        System.out.println(map.get("ab224"));

    }
}
