package exercise3;

public class Dog {
    int size;
    String name;

    //吠えるメソッドを作る
    //サイズに(size変数)よって吠え方を変える　３パターンで
    //「〇〇は〜と吠えた」と表示する

    public void howling(){
        if (size > 20) {
            System.out.println(name + "はワフと吠えた");
        } else if (size == 15) {
            System.out.println(name + "はバウと吠えた");
        } else {
            System.out.println(name + "はヴォフと吠えた");
        }
    }
    //このクラスができたら、
    //MainクラスからDogオブジェクトを作り確認してください

}
