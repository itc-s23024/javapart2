package exercise2;

public class Test3 {
    public static void main(String[] args) {

        int[] ar = {1, 5, 2, 0, 8, 6};

        //新しいメソッドを作る
        //引数はint型の配列
        //一番小さい値を求めて、戻り値で返す
        //Math.min(a,b) で小さい数が求められます
        int result = smallest(ar);
        System.out.println(result);


    }
    public static int smallest(int[] array){
        int min = Integer.MAX_VALUE;
        for (int value: array){
            min = Math.min(value, min);
        }
        return min;
    }

    //一番大きい値を求めるメソッドを作る

    /*
    public static int smallest(int a, int b, int c){
        int r = Math.min(Math.min(a,b),c);
        return r;
    }
     */
}
