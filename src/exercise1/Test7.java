package exercise1;

public class Test7 {
    public static void main(String[] args) {
        /*
         1 2 3 4 5 6 7 8 9 10
        2 4 6 8 10 12 14 16 18 20
        3 6 9 12 15 18 21 24 27 30
        4 8 12 16 20 24 28 32 36 40
        5 10 15 20 25 30 35 40 45 50
        6 12 18 24 30 36 42 48 54 60
        7 14 21 28 35 42 49 56 63 70
        8 16 24 32 40 48 56 64 72 80
        9 18 27 36 45 54 63 72 81 90
        10 20 30 40 50 60 70 80 90 100
         */
        //二次元配列に入れて、表示する
        //足し算はせずに、行と列の掛け算で表示する
//        int[][] table = new int[10][10];

//        for (int y =0; y < table.length; y++) {
//            for (int x = 0; x < table[0].length; x++) {
//                table[y][x] = (y+1) * (x+1);
//                System.out.print(table[y][x] + " ");
//            }
//            System.out.println();
//        }
        /*
            10 20 30
            40 50 60
         */
        int[][] date = {{10,20,30},{40,50,60}};
        for (int i =0; i < date.length; i++) {
            for (int k = 0; k < date[0].length; k++) {
                System.out.print(date[i][k] + " ");
            }
            System.out.println();
        }
        /*
           10 20
           30 40
           50 60
         */
        //新しい配列を作り、dataの値を代入する
        int[][] newdate = new int[3][2];
        for (int y =0; y < newdate.length; y++) {
            for (int x = 0; x < newdate.length; x++) {
                System.out.print(newdate[y][x] + " ");
            }
            System.out.println();
        }
    }
}
