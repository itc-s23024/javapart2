package exercise1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lesoon3 {
    public static void main(String[] args) {
        //String型の値が入る空のリストを作ってください
        //そこには、名前を入れます
        //3名ぐらい追加する
        //一覧を表示する
        ArrayList<String> name = new ArrayList<>();
        name.add("Mike");
        name.add("_Lisa");
        name.add("Emily");
        name.add("_John");

        //name.remove("Lisa");

//        for (String n:name){
//            //先頭の文字を調べる
//            if (n.startsWith("_")){
//                name.remove(n);
//            }
//            //System.out.println(name);
//        }

        Iterator<String> it = name.iterator();
        while (it.hasNext()){
            if (it.next().startsWith("_")){
                it.remove();
            }
            //System.out.println(it.next());
        }
        System.out.println(name);

    }
}
