package exercise1;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        //標準入力で数値を受け取る
        //一番目は入力値の合計数
        //二番目以降から整数が入力される
        //その数値の中から一番大きい数を見つけて出力

        //入力された整数をいったん、配列に入れる
        //その配列の中から一番大きい数を見つける

        //3
        //1
        //10
        //5

        //一番大きい数は10なので、10を出力

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        //size分の要素が入る配列を作る
        int[] array = new int[size];

        //size回ループさせ、入力された値を配列に格納する
        for (int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }

        //配列の中からひとつずつ要素を参照し、一番大きい数を見つける
        int maximun = array[0];
        for (int i = 1; i<array.length; i++){
            if (array[i] > maximun){
                maximun = array[1];
            }
        }
        System.out.println(maximun);

        //見つけた一番大きい数を表示する
    }
}
