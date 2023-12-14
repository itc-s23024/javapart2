package chapter12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Sample7 {
    public static void main(String[] args) {
        //p.291参考
        //文字列のArrayListを作る
        //このリストにJava, Kotlin, Python を追加する
        var list = new ArrayList<>();
        list.add("Java");
        list.add("Kotlin");
        list.add("Python");

        //このリストの要素すべて表示する
        list.forEach(System.out::println);

        //文字列のHashMapを作る
        //上のリストの値を取り出し、このマップに入れる
        //0 Java, 1,Kotlin 2,Python
        //キー 値
        //p.135 for文を使う
        var map = new HashMap<Integer, String>();
        for (int i=0; i < list.size(); i++){
            map.put(i, (String) list.get(i));
        }

        ////このリストの要素すべて表示する
        map.forEach((k, v)-> System.out.println(k + " " + v));
    }
}
