package kimatusikenn2gatu;

import java.util.Random;
import java.util.Scanner;

public class TangoGame3 {
    public static void main(String[] args) {
        // 各文字数ごとに問題をグループ分けし、ランダムに選択する
        String[][] answer_groups = {
                {"AR"},
                {"BOOK", "TEST", "AICE"},
                {"RIME", "APPLE", "NIHON"},
                {"YAMATO", "OSASIMI"},
                {"KAIJYUU"}
        };

        // 対応するヒントを保持する配列
        String[] hints = {
                "二文字の言葉",
                "四文字の言葉",
                "五文字の言葉",
                "六文字の言葉",
                "四文字の怪獣"
        };

        Scanner sc = new Scanner(System.in);

        // ランダムに答えを選択
        Random r = new Random();
        int rand_group = r.nextInt(answer_groups.length);
        String[] selected_group = answer_groups[rand_group];
        int rand_word = r.nextInt(selected_group.length);
        String str = selected_group[rand_word];

        char[] answer_wourd = str.toCharArray();

        char[] guess = new char[answer_wourd.length];
        for (int i=0; i<guess.length; i++){
            guess[i] = '_';
        }

        int count = 10;
        boolean completed = false;

        while (!completed && count > 0) {
            System.out.println("現在の状態: ");
            printArray(guess);

            System.out.println("ヒント: " + hints[rand_group]); // ヒントを表示

            System.out.println("1文字を入力してください");
            String s = sc.nextLine();
            char input = s.charAt(0);
            input = Character.toUpperCase(input);
            count--;

            //guess配列を書き換える
            for (int i = 0; i < answer_wourd.length; i++) {
                if (answer_wourd[i] == input) {
                    guess[i] = input;
                }
            }

            if (checkWin(guess)) {
                System.out.println("正解です");
                completed = true;
            }
        }

        if (!completed){
            System.out.println("ゲームオーバー");
        }
    }

    public static void printArray(char[] array){
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " "); // printlnではなくprintに変更
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
