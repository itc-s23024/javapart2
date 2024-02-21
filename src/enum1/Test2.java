package enum1;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        //SMALL, MEDIUM, LARGE, EXTRALARGE
        System.out.println("どのサイズにしますか？");
        System.out.println("SMALL, MEDIUM, LARGE, EXTRALARGE");
        Drink drink = new Drink();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if (name.equals("SMALL") || name.equals("MEDIUM") || name.equals("LARGE") || name.equals("EXTRALARGE")){
            drink.order(name);
        }else {
            System.out.println("無効な選択です");
        }

    }
}

class Drink{
    void order(String size){
        System.out.println(size + "が注文されました");
    }
}
