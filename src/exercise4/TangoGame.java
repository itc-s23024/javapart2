package exercise4;

import java.util.Random;
import java.util.Scanner;

public class TangoGame {

    public static void main(String[] args) {
        //＊変数の定義
        //答え
        //入力値
        //チャレンジできる精神
        //答えを配列に入れる
        //String[] answer_list = {"BOOK", "APPLE", "JAPAN"};
        String[] answer_list = {"BOOK"};
        Scanner sc = new Scanner(System.in);

        //ランダムに答えを決め、char型配列に変換する
        Random r = new Random();
        int rand_num = r.nextInt(answer_list.length);
        String str = answer_list[rand_num];
        char[] answer_wourd = str.toCharArray();

        //正解が入っている配列は　answer_word

        // _ で埋めたchar型配列を作る
        char[] guess = new char[answer_wourd.length];
        for (int i=0; i<guess.length; i++){
            guess[i] = '_';
        }


        int count = 5;
        boolean completed = false;
        //completed == false
        while (!completed && count > 0) {
            System.out.println("現在の状態: ");

            //printArayメソッド名を呼び出す
            printArray(guess);

            //「1文字を入力してください」と表示して、ユーザーが入力した文字を取得し変数に入れる
            System.out.println("1文字を入力してください");
            String s = sc.nextLine();
            char input = s.charAt(0);
            input = Character.toUpperCase(input);
            count--;

            //guess配列を書き換える
            // _ _ _ _ -> bが入力されたら B _ _ _
            for (int i = 0; i < answer_wourd.length; i++) {
                if (answer_wourd[i] == input) {
                    guess[i] = input;
                }
            }

            //checkWinメソッドを使い、判定する
            //trueが返ってきたら正解ということ
            if (checkWin(guess)) {
                System.out.println("正解です");
                completed = true;
            }
        }
            //ゲームオーバー
            if (!completed){
                System.out.println("ゲームオーバー");
            }


        /*
        単語当てゲーム！
        現在の状態:_ _ _ _
        残り回数: 5
        1文字を入力してください
         a
         現在の状態:_ _ _ _
         残り回数:4
         1文字を入力してください
         b
         */


    }

    //配列の中身を表示するメソッドを作る
    //引数は　配列(char型)
    //printArayメソッド名
    public static void printArray(char[] array){
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    //判定するメソッド
    //引数はguess配列
    //guess配列の要素にひとつでも_が含まれていたら,falseを返す
    //_がひとつもなければtrueを返す
    public static boolean checkWin(char[] array){
        for (int i=0; i< array.length; i++){
            if (array[i] == '_'){
                return false;
            }
        }
        return true;
    }

}
