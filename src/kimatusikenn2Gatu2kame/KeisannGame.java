package kimatusikenn2Gatu2kame;

import java.util.Scanner;

//マリオ風の掛け算計算アプリ
public class KeisannGame {
    // 問題生成メソッド
    public static int generateQuestion() {
        int num1 = (int) (Math.random() * 10) + 1; // 1から10までの乱数を生成
        int num2 = (int) (Math.random() * 10) + 1;
        System.out.println("マリオ：「" + num1 + "✕" + num2 + " は？」"); // 問題文の表示
        return num1 * num2; // 正解を返す
    }

    // マリオの応答メソッド
    public static void marioResponse(boolean isCorrect) {
        if (isCorrect) {
            System.out.println("マリオ：「すごい！正解だ！イヤッフー！」");
        } else {
            System.out.println("マリオ：「残念！違うよ！」");
        }
    }

    // メインメソッド
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0; // 正解数を格納する変数

        // 10問の掛け算問題を出題
        for (int i = 0; i < 10; i++) {
            int correctAnswer = generateQuestion(); // 問題生成
            int userAnswer = scanner.nextInt(); // ユーザーの回答を受け取る

            // 回答の正誤判定とマリオの応答
            if (userAnswer == correctAnswer) {
                marioResponse(true);
                score++; // 正解なら得点を加算
            } else {
                marioResponse(false);
            }
        }

        // 最終結果の表示
        System.out.println("マリオ：「終了だ！君の成績は " + score + "/10 だ！」");
        if (score == 10) {
            System.out.println("マリオ：「おめでとう！全問正解だ！さすがマリオだ！」");
        } else {
            System.out.println("マリオ：「もっとがんばれ！君ならきっとできる！」");
        }
        scanner.close(); // スキャナーのクローズ
    }
}
