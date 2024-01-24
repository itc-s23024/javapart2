package exercise4;

import java.util.Random;

public class TangoGame {
    public static void main(String[] args) {
        //＊変数の定義
        //答え
        //入力値
        //チャレンジできる精神
        //答えを配列に入れる
        String[] answer_list = {"BOOK", "APPLE", "JAPAN"};

        //ランダムに答えを決め、char型配列に変換する
        Random r = new Random();
        int rand_num = r.nextInt(answer_list.length);
        String str = answer_list[rand_num];
        char[] answer_wourd = str.toCharArray();
        //System.out.println(answer_wourd[0]);

        // _ で埋めたchar型配列を作る
        char[] guess = new char[answer_wourd.length];
        for (int i=0; i<guess.length; i++){
            guess[i] = '_';
        }

        System.out.println("現在の状態: ");
        //guessという配列の中身を表示する


        /*
        単語当てゲーム！
        現在の状態:_ _ _ _
        残り回数: 5
        1文字を入力してください
         */


        //＊どういう機能が必要か　メソッド
        //答えと入力値が同じ文字だったらtrueを返す
        //現在の状態を表示する
        //回数を５回までにする
        //５回終わったらゲームオーバー
        //当たってたらゲームクリア

    }
}
