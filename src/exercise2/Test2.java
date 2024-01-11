package exercise2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*
        １番目の値を入力してください:
        2番目の値を入力してください:
        3番目の値を入力してください:
        1番小さい値は　〇　です

        引数の値の中から一番小さい値を求めるメソッドを作る
        引数3つ int
        戻り値 int
         */
        Scanner sc = new Scanner(System.in);

        System.out.println("1番目の値を入力してください");
        int x = sc.nextInt();

        System.out.println("2番目の値を入力してください");
        int y = sc.nextInt();

        System.out.println("3番目の値を入力してください");
        int z = sc.nextInt();

        int result = smallest(x,y,z);
        System.out.println(result);

    }

    //メソッド
    public static int smallest(int a, int b, int c){
        int r = Math.min(Math.min(a,b),c);
        return r;
    }

}
