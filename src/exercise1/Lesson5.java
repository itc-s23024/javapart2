package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class Lesson5 {
    public static void main(String[] args) {
        //Records型のリストを作る
        //値は好きなように入れて
        //その中から70点以下の要素を削除する
        ArrayList<Records> records = new ArrayList<>();
        records.add(new Records("Mike", 80));
        records.add(new Records("Lisa", 65));
        records.add(new Records("Emily", 90));

        Iterator<Records> it = records.iterator();
        while (it.hasNext()){
            Records r = it.next();
            if (r.score <= 70){
                it.remove();
            }
        }

        System.out.println(records);
    }
}

class Records{
    String name;  //生徒名
    int score;   //点数

    public Records(String name, int score) {
        this.name = name;
        this.score = score;
    }
}