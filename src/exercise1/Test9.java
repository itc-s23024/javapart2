package exercise1;

import java.util.Arrays;

public class Test9 {
    public static void main(String[] args) {
        //配列の値は学籍番号を表している
        //両日とも参加した人数を求めてください
//        int[] day1 = {3, 10, 4, 7, 8};
//        int[] day2 = {9, 8, 6, 10, 1};

/*        int count =0;
        for (int x=0; x < day1.length; x++) {
            for (int y=0; y < day2.length; y++) {

                if (day1[x] == day2[y]) {
                    count++;
                }
            }
        }
        System.out.println(count);
*/

        //char[] date = {'a', 'b', 'c'};
        char c = 0x0061;
        System.out.println(c);

        char[] array = new char[3];
        array[0] = 0x0061;
        array[1] = 0x0062;
        array[3] = 0x0063;
        System.out.println(Arrays.toString(array));

        /*
        Web Web 休憩 Linux
        java 休憩 Python 休憩
        休憩　休憩　Web Java
         */

        String[][] calendar = {
                {"Web", "Web", null, "Linux"},
                {"Java", "", "Python", ""},
                {null, null, "Web", "Java"}
        };

        for (int y=0; y<calendar.length; y++){
            for (int x=0; x< calendar[y].length; x++) {
                //nullまたは空文字のとき休憩と表示する
                if (calendar[y][x] == null || calendar[y][x].equals("")){
                    System.out.println("休憩 ");
            }else{
                System.out.println(calendar[y][x] + " ");
            }
        }
            System.out.println();
        }


    }

}
