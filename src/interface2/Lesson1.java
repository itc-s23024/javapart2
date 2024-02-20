package interface2;

import java.util.Scanner;

public class Lesson1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PaymentStrategy[] options = new PaymentStrategy[3];

        options[0] = new CreditCard();
        options[1] = new Emoney();
        options[2] = new Cash();

        System.out.println("お支払い方法を選んでください");
        for (PaymentStrategy option : options){
            String name = option.getName();
            System.out.println(name);
        }
//        System.out.println("１：クレジットカード");
//        System.out.println("２：電子マネー");
//        System.out.println("３：現金");

        int num = sc.nextInt();

        PaymentProcessor p = new PaymentProcessor(options[num-1]);
        p.pay();

//        if (num == 1) {
//            PaymentProcessor p = new PaymentProcessor(new CreditCard());
//            p.pay();
//        } else if (num == 2) {
//            PaymentProcessor p = new PaymentProcessor(new Emoney());
//            p.pay();
//        } else if (num == 3) {
//            PaymentProcessor p = new PaymentProcessor(new Cash());
//            p.pay();
//        }

//        p.processPayment(num);


    }
}

class PaymentProcessor{
    PaymentStrategy ps;

    public PaymentProcessor(PaymentStrategy ps){
        this.ps = ps;
    }

    //支払う
    public void pay(){
        ps.processPayment();
    }

//    void processPayment(int num){
//        if (num == 1){
//            System.out.println("クレジットカード番号を入力してください");
//        }else if (num == 2) {
//            System.out.println("端末にかざしてください");
//        }else if (num == 3){
//            System.out.println("現金を入れてください");
//        }
//    }
}
/*
        お支払い方法を選んでください
        １：クレジットカード
        ２：電子マネー
        ３：現金

        下記のメッセージを表示する
        クレジットカード番号を入力してください
        端末にかざしてください
        現金を入れてください
*/