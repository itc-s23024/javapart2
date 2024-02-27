package kimatusikenn2gatu;

import java.util.Random;
import java.util.Scanner;

public class TangoGame2 {
    public static void main(String[] args) {

        //問題の量を増やした
        String[] answer_list = {"AR","BOOK","TEST","AICE","RIME","APPLE","NIHON","YAMATO","OSASIMI","KAIJYUU"};
        Scanner sc = new Scanner(System.in);

        //ランダムに答えを決め、char型配列に変換する
        Random r = new Random();
        int rand_num = r.nextInt(answer_list.length);
        String str = answer_list[rand_num];


        char[] answer_wourd = str.toCharArray();

        char[] guess = new char[answer_wourd.length];
        for (int i=0; i<guess.length; i++){
            guess[i] = '_';
        }

        //残り回数を5->10に変更した
        int count = 10;
        boolean completed = false;

        while (!completed && count > 0) {
            System.out.println("現在の状態: ");

            printArray(guess);

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

    public static void printArray(char[] array){
        for (int i=0; i<array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public static boolean checkWin(char[] array){
        for (int i=0; i< array.length; i++){
            if (array[i] == '_'){
                return false;
            }
        }
        return true;
    }
}
