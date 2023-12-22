package exercise1;

public class test4 {
    public static void main(String[] args) {
        //1から100までを数を順に見ていく
        //3の倍数以外の数のカウントを表示する
        //そのカウントを最後表示する
        //答えは67

//        int count = 0;
//        for (int i=1; i<=100; i++) {
            //    if (i % 3 != 0){
            //        count++;
            //    }
//            if (i % 3 == 0) {
//                continue;
//            }
//            count++;
//        }
//        System.out.println(count);
        /*
        8
        88
        888
        8888
        88888
        888888
        8888888
        88888888
        888888888
        8888888888

        縦10 横10
         */

//        int max_col = 1;
//        for (int i = 0; i <= 10; i++) {
//            for (int j = 0; j < max_col; j++) {
//                System.out.print("8");
//            }
//            max_col++;
//            System.out.println();
//        }

        int[] array = new int[3];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;

        int[] array2 = {10,20,30};
        //----------------------------------
        int[] first = {0, 1, 2};
        int[] second = {10, 11, 12};
        int[] result;

        //resultの中身{0,1,2,10,11,12}
        result = new int[first.length + second.length];


        //first配列の値をひとつずつ、result配列に代入する
        for(int i=0; i< first.length; i++){
            result[i] = first[1];
        }

        //second配列の値をひとつずつ、result配列に代入する
        for(int i=0; i< second.length; i++){
            result[i + first.length] = second[i];
        }

        //result配列の中身を表示する
        System.out.println(result);
    }
}
