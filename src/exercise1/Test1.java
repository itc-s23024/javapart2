package exercise1;

public class Test1 {
    public static void main(String[] args) {
        //Helloという文字列を100回表示する
//        for (int i = 0; i < 100; i++) {
//            System.out.println("Hello");
//        }

        //while文で書き換え  p.138
//        int i = 0;
//        while (i < 100) {
//            System.out.println("Hello");
//            i++;
//        }

        /*
        QQQQQQQQQQ
        QQQQQQQQQQ
        QQQQQQQQQQ
        QQQQQQQQQQ
        QQQQQQQQQQ
         */
        //縦５　横１０

        int rows = 5;
        int cols = 10;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Q");
            }
            System.out.println();
        }
    }
}
