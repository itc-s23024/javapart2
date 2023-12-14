package exercise1;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //String str = sc.nextLine();
        //int a = sc.nextInt();

        if (sc.hasNextInt()){
            System.out.println("数値です");
        } else {
            System.out.println("数値ではありません");
        }

        if (sc.hasNextLine()){
            System.out.println("文字列です");
        } else {
            System.out.println("文字列ではありません");
        }

        //ENTERという文字列が入力するまで標準入力を受け付ける
        //入力された数値を足していく
        //最後、この合計を表示する
        //while文を使う
        //---------------------------------------------------------------
        //ENTERが入力されるまでループ１
        int sum = 0;
        boolean isExit = false;

        while(isExit == false){
            if(sc.hasNextInt()) {
                //もし、入力されたら、足していく
                int number = sc.nextInt();
                sum = sum + number;

            }else if(sc.hasNextLine()){
                //もし、文字列が入力されたら、ENTERという文字列かどうか調べる。
                //ENTERが入力されたらループを止めたい１
                String s = sc.nextLine();
                if (s.equals("ENTER"));
                isExit = true;
            }
        }

        //合計を表示する
        System.out.println(sum);
    }
}
