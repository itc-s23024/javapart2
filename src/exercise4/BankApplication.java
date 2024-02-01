package exercise4;

import java.util.Scanner;

public class BankApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("お名前とIDを入力してください");
        //名前とIDを取得する
        String name = sc.nextLine();
        String id = sc.nextLine();

        //BankAccountオブジェクトを作る
        BankAccount account = new BankAccount(name, id);

        //BankAccountクラスmenuメソッドを呼び出す
        account.menu();

    }
}

class BankAccount{
    //フィールド
    //customerName 顧客名
    String customerName; //顧客名
    //customerId 顧客ID
    String custmerTd; //顧客ID
    //balance 残高
    int balance; //残高

    int prevPrice;

    public BankAccount(String customerName, String custmerTd) {
        this.customerName = customerName;
        this.custmerTd = custmerTd;
    }

    /*
       お名前とIDを入力してください
       お名前: 〇〇様(ID:〇〇〇)
       a) 残高照会
       b) 預入
       c) 引出
       d) 取引履歴
       e) 終了
        */
    //メソッド
    //menu メニュー　操作を選ばせる　例： bが選ばれたらdepositメソッドを呼びだす
    void  menu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("お名前: " + customerName + "様(ID:" + custmerTd + ")");
        System.out.println("a) 残高照会");
        System.out.println("b) 預入");
        System.out.println("c) 引出");
        System.out.println("d) 取引履歴");
        System.out.println("e) 終了");

        String option = "";

        while (!option.equals("e")) {
            System.out.println("操作を選んでください");
            option = sc.next();

            switch (option) {
                case "a":
                    //残高照会
                    System.out.println("残高" + balance + "円");
                    break;

                case "b":
                    //預入
                    System.out.println("預け入れる金額を入力してください");
                    int amount = sc.nextInt();
                    deposit(amount);
                    break;

                case "c":
                    //引き出し
                    System.out.println("引き出す金額を入力してください");
                    int amountw = sc.nextInt();
                    withdraw(amountw);
                    break;

                case "d":
                    //取引履歴
                    getPreTrans();
                    break;

                case "e":
                    System.out.println("終了します");
                    break;

                default:
                    System.out.println("default");
                    break;
            }
        }

    }
    //deposit 預入
    //引数で受け取った金額を残高にプラスする
    void deposit(int amount){
        if (amount > 0){
            balance += amount;
        }
    }
    //withdraw 引き出し
    void withdraw(int amount){
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            prevPrice = amount;
        }else {
            System.out.println("金額に誤りがあります。引き出せません。");
        }
    }
    //getPreTrans 取引履歴
    void getPreTrans(){
        //預入したなら　預入: 〇〇円
        //引き出ししたなら　引出: -〇〇円
        if (prevPrice == 0){
            System.out.println("取引履歴はありません");
        }else {
            String msg = (prevPrice > 0) ? "預入" : "引出";
            System.out.println(msg + ": " + prevPrice + "円");
        }
    }

}
