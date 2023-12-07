package chapter12;

import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    public static void main(String[] args) {

        //配列を使い　おはよう　こんにちは　こんばんは　を表示する
        //配列に　おはよう　こんにちは　こんばんは　という値を代入すること
//        String[] greetings = new String[3];
//        greetings[0] = "おはよう";
//        greetings[1] = "こんにちは";
//        greetings[2] = "こんばんは";
//
//        for (int i=0; i<greetings.length; i++){
//            System.out.println(greetings[i]);
//        }

        List<String> greetings = new ArrayList<>();
        greetings.add("おはよう");
        greetings.add("こんにちは");
        greetings.add("こんばんは");

        for (String s:greetings){
            System.out.println(s);
        }

        //greetingリストの0番目の要素を取得して表示する
        String s = greetings.get(0);
        System.out.println(s);

        //その値が「おはよう」なら「yes」と表示する
        if (s.equals("おはよう")){
            System.out.println("yes");
        }

        //greetingsリストが「good morning」という要素を含んでいるか
        //true または falseで表示する
        System.out.println(greetings.contains("good morning"));

        //greetingsリストが空でなかったら、要素の数を表示する
        if (greetings.isEmpty()){
            System.out.println(greetings.size());
        }

        //greetingsリストの2番目の要素を削除する
        greetings.remove(2);

    }
}
