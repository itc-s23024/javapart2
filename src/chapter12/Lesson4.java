package chapter12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lesson4 {
    public static void main(String[] args) {
        //Mountainクラス
        //フィールド名　山の名前:String　高さ:int
        List<Mountain> mountain = new ArrayList<>();
        mountain.add(new Mountain("Longs", 14265));
        mountain.add(new Mountain("Elebert", 14433));
        mountain.add(new Mountain("Maroon", 14156));
        mountain.add(new Mountain("Castle", 14265));

        //リストを作り、Mountainのインスタンスをいれる
        mountain.sort(Comparator.comparing(Mountain::getName));
        mountain.forEach(System.out::println);

        System.out.println();

        mountain.sort(Comparator.comparing(Mountain::getHeight));
        mountain.forEach(System.out::println);

        //下記の出力結果になるようソートさせる
        /*
        元データ
        [Longs14255, Elbert 14433, Maroon 14156, Castle 14265]

        名前でソート
        [Castle 14265, Elbert 14433, Longs 14255, Maroon 14156]

        高さでソート
        [Elbert 14433, Castle 14265, Longs 14255, Maroon 14156]
         */
    }
}
