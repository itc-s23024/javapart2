package exercise1;

public class Test6 {
    public static void main(String[] args) {
        //演習問題
        //下のように出力してください
        //for文の練習です
        /*
           0 1 2
           3 4 5
           6 7 8
         */

        //上の0から8までの数値を二次元配列に入れる


        int[][] numbers = new int[3][3];
        //a[0][0] = 10;

        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int k = 0; k < 3; k++) {
                numbers[i][k] = count;
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
