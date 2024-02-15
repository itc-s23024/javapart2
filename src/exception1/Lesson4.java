package exception1;

public class Lesson4 {
    public static void main(String[] args) {
        //try-catch文
        //divideNumを呼び出す
        //0で割られたとき例外をキャッチして「0で割ることはできません」と表示する
        try {
            System.out.println(divideNum(2, 0));
        }catch (ArithmeticException e){
            System.out.println("0で割ることはできません");
        }
    }

    //メソッド名：divideNum
    //引数：2つ　ともに整数(a, b)
    //a / b した値を返す
    //throws ArithmeticException
    static int divideNum(int a, int b) throws ArithmeticException{
        int d = a / b;
        return d;
    }
}
