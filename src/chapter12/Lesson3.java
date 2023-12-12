package chapter12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lesson3 {
    public static void main(String[] args) {

        //Movieクラスを作る
        //Movieクラスのインスタンスをリストに入れる
        //タイトルで並び替え(昇順)
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Avator", 29.237, 2009));
        movies.add(new Movie("Taitanic", 22.647, 1997));
        movies.add(new Movie("Spider-Man", 19.218, 2021));
        movies.add(new Movie("Frozen", 13.343, 2013));
        movies.add(new Movie("2012", 7.912, 2009));

        movies.sort(Comparator.comparing(Movie::getTitle));
        movies.forEach(System.out::println);

        //-----------------------------------
        //Movieクラス内容
        //フィールド名　タイトル:String　興行収入:double　製作年:int
        //フィールドはすべてprivate宣言
    }
}
