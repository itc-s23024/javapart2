package pizza;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    //ピザがたくさん入るリスト型の変数を作る
    private List<Pizza> pizzaList = new ArrayList<>();
    private int total;

    //引数：追加したいピザのインスタンス
    //そのインスタンスをpizzaListに追加するメソッド
    public void addPizza(Pizza p){
        pizzaList.add(p);
    }

    //Pizzaリストを返すメソッドを作る
    public List<Pizza> getPizzaList(){
        return pizzaList;
    }

    //totalの変数の値を増やしていくメソッド
    //引数： カートに入れたピザの価格
    public void addTotal(int price){
        total += price;
    }

    //totalの変数の値を返すメソッド
    public int getTotal(){
        return total;
    }
}
