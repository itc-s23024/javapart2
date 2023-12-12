package chapter12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
public class Lesson2 {
    public static void main(String[] args) {
        //映画のタイトルを入れたリストを作る
        //(前回のgreetingsリストの作り方参考)
        //forEachのメソッドを使い、全要素を表示させる。
        List<String> greatings = new ArrayList<>();
        greatings.add("となりのトトロ");
        greatings.add("天空の城ラピュタ");
        greatings.add("千と千尋の神隠し");
        greatings.add("紅の豚");

        greatings.sort(Comparator.naturalOrder());

        greatings.forEach(System.out::println);
    }
}
