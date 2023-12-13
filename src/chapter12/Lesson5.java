package chapter12;

import java.util.TreeSet;

public class Lesson5 {
    public static void main(String[] args) {
        //Bookクラスを作る
        //フィールドは　本の名前:String

        //BookのインスタンスをTreeSetに入れる
        //本の名前順に表示 (昇順)
        var tree = new TreeSet<Book>();
        tree.add(new Book("漢字辞典"));
        tree.add(new Book("英語辞典"));
        tree.add(new Book("生物図鑑"));
        tree.add(new Book("六法全書"));

        tree.forEach(System.out::println);
    }
}
