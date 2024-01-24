package exercise4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        //標準入力で取得した数値が
        //10より大きいとき−１
        //10より小さいとき１
        //10と等しいとき０
        //を戻り値で返すメソッドを作る
        //引数は、標準入力で取得した数値
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int kazu = checkNumber(num);
        System.out.println(kazu);

        Integer i1 = Integer.valueOf(10);
        System.out.println(i1.compareTo(num));

        //int型からString型へ変更
        int a = 10;
        String s = String.valueOf(a);

        //Stringからint
        int s2 = Integer.valueOf(s);


    }

    //メソッド
    public static int checkNumber(int kazu){
        if (10 < kazu){
            return -1;
        }else if (10 > kazu){
            return 1;
        }else{
            return 0;
        }
    }

}
