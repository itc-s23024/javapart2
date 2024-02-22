package exercise1;

import java.util.ArrayList;
import java.util.Iterator;

public class Lesson4 {
    public static void main(String[] args) {
        //整数が入る空のリストを作る
        //適当な数字を追加してください (要素数5つ)
        //10より小さいものは削除する
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(15);
        nums.add(100);
        nums.add(75);
        nums.add(8);

        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()){
            Integer number = it.next();
            if (number <= 10){
                it.remove();
            }
        }
            System.out.println(nums);
        }
    }
