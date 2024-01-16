package exercise2;

import java.util.Arrays;

public class Test5 {
    public static void main(String[] args) {
        int num = 10;
        change(num);
        //10
        //System.out.println(num);

        int[] nums = {1, 2, 3};
        change(nums);
        //10,2,3
        System.out.println(Arrays.toString(nums));

        String name = "Mike";
        change(name);
        System.out.println(name);

/*        String str = "apple";
        System.out.println(str);
        str = "book";
        System.out.println(str);
*/
        String str = "apple";
        String back = str;
        str = "book";
        System.out.println(str == back);


    }

    public static void change(int n){
        n = 20;
    }

    public static void change(int[] n){
        n[0] = 10;
    }

    public static void change(String s){
        s = "Lisa";
    }
}
