package pizza;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int total_price;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        boolean orderflg = false;
        //配列かリストを作り、それぞれのピザのインスタンスを入れる
        System.out.println("WELCOME TO MY PIZZA STORE!!");
        Pizza[] pizzas = new Pizza[4];
        pizzas[0] = new Margerita();
        pizzas[1] = new PotatoPizza();
        pizzas[2] = new CheesePizza();
        pizzas[3] = new Hawaiian();

        //そのインスタンスのID,name,priceを表示する
        for (Pizza p : pizzas){
            System.out.println("商品ID:" + p.id + "  " + "商品名:" + p.name + "  " + "価格:" + p.price + "円");
        }

        while (!orderflg){
            try {
                System.out.println("ご希望のピザの商品IDを入力してください:");
                int input_id = sc.nextInt() - 1;

                //入力しされた商品IDが1から4の間のみカードに入れられるようにする
                if (input_id < 0 || input_id > 3){
                    System.out.println("その商品IDは登録されていません");
                    continue;
                }

                //商品IDを入力させ、そのピザのインスタンスをカートに入れる
                //CartクラスのaddPizzaメソッドを呼び出す（ピザ追加）
                cart.addPizza(pizzas[input_id]);
                cart.addTotal(pizzas[input_id].price);

            }catch (InputMismatchException e){
                System.out.println("商品IDは数値で入力してください");
                sc.next();
                continue;
            }


        System.out.println("<< カートの中身 >>");
        //CartクラスのgetPizzaListメソッドを呼び出し、名前、価格を表示する
        List<Pizza> pizzaArrayList = cart.getPizzaList();
        for (Pizza p : pizzaArrayList){
            System.out.println("商品名:" + p.name + "価格:" + p.price + "円");
        }

        /*
        支払いに進みますか(y:はい n:いいえ)
        nだったらもう一度商品IDを入力させる
        yだったら合計金額を表示する
         */
        System.out.println();
        System.out.println("支払いに進みますか(y:はい n:いいえ)");
        String ans = sc.next();
        if (ans.equals("y")){
            orderflg = true;
        }
      }

        //支払いに進むので合計金額を表示する
        total_price = cart.getTotal();
        System.out.println("合計金額:" + total_price + "円");

        List<Pizza> pizzaArrayList = cart.getPizzaList();
        for (Pizza p : pizzaArrayList){
            p.bake();
            p.cut();
            p.boxing();
            System.out.println();
        }
        System.out.println("出来上がりました!");

        /*
    　　マルゲリータを作っています...
    　　マルゲリータをカットしています...
    　　マルゲリータを箱に入れています...

    　　チーズベーコンピザを作っています...
    　　チーズベーコンピザをカットしています...
    　　チーズベーコンピザを箱に入れています...

    　　出来上がりました
     　　*/
    }
}
