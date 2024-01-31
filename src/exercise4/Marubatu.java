package exercise4;

import java.util.Scanner;

public class Marubatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char currentMark = 'X';

        //3行3列の二次元配列を作る　中身は空　char型
        char[][] board = new char[3][3];

        //この配列に-を代入する
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                board[i][j]='-';
            }
        }

        while (true) {
            //この配列の中身を表示する
            printBoard(board);

            System.out.println();
            System.out.println("現在のプレーヤー:" + currentMark);

            //行番号と列番号を入力させる
            System.out.println("行番号を入力してください(上が1、下が3)");
            int row = sc.nextInt() - 1;

            System.out.println("列番号を入力してください(左が1、右が3)");
            int col = sc.nextInt() - 1;

            //選べるかどうかチェックする
            boolean a = isValidMove(board, row, col);
            if (a == true) {
                //その行と列の値をXにする
                board[row][col] = currentMark;

                //そろったかどうかチェックする
                if (checkWin(board, currentMark)){
                    printBoard(board);
                    System.out.println(currentMark +"マークがそろった");
                    break;
                }

                //引き分けかどうかチェックする
                if (checkTie(board)){
                    printBoard(board);
                    System.out.println("引き分け");
                    break;
                }

                //マークを切り替える　Xと〇
                if (currentMark == 'X'){
                    currentMark = 'O';
                }else{
                    currentMark = 'X';
                }



            } else {
                System.out.println("選べません");

            }
        }

        //printBoard(board);
    }

    //引き分けかどうかチェックする
    //〇か×でマスがすべて埋まったときが引き分けということ
    //メソッド名：checkTie
    //引数：対象配列
    //戻り値：引き分けのときtrue,そうでないときfalse
    public static boolean checkTie(char[][] board){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (board[i][j] == '-'){
                    return false;
                }
            }
        }
        return true;
    }

    //3マス同じマークでそろったかチェックする
    //縦、横、斜めのどれかがそろったらtrue
    //それ以外はfalse
    //メソッド名：checkWin
    //引数：対象配列
    //戻り値：boolean
    public static boolean checkWin(char[][] board, char mark){

        //char mark = 'X';

        for(int i=0; i<3; i++){
            //横のチェック
            if(board[i][0] == mark && board[i][1] == mark && board[i][2] == mark){
                return true;
            }

            //縦のチェック
            if(board[0][i] == mark && board[1][i] == mark && board[2][i] == mark){
                return true;
            }
        }

        //斜めのチェック
        if(board[0][0] == mark && board[1][1] == mark && board[2][2] == mark ||
                board[0][2] == mark && board[1][1] == mark && board[2][0] == mark){
            return true;
        }
        return false;
    }




    //ユーザーの入力した行番号と列番号が1～3（0～2）　かつ
    //XやOといった文字が配列にすでに入っていないかチェック
    //上記の条件を満たしたとき　true
    //それ以外はfalseを返す
    public static boolean isValidMove(char[][] board, int row, int col){
        if(row >= 0 && row <=2 && col >=0 && col <=2){
            if(board[row][col] == '-'){
                return true;
            }
        }
        return false;
    }




    //boardの中身を表示する部分を新しいメソッドにする
    //メソッド名：printBoard
    //引数：char型配列（表示したい配列）
    //戻り値：なし
    public static void printBoard(char[][] board){
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

}
