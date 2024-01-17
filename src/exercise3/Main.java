package exercise3;

public class Main {
    public static void main(String[] args) {

        //Dogオブジェクトを作り、howlingメソッドを呼び出す
        Dog dog1 = new Dog();
        dog1.name = "ジョン";
        dog1.size = 30;
        dog1.howling();

        Dog dog2 = new Dog();
        dog2.name = "チャーリー";
        dog2.size = 15;
        dog2.howling();

        Dog dog3 = new Dog();
        dog3.name = "ワトソン";
        dog3.size = 5;
        dog3.howling();

        //この３匹を配列に入れる
        //for文を使い、吠えるメソッドを呼び出す(配列に使うこと)

        //もしint型の配列ならば
        int[] date = new int[3];
        date[0] = 10;

        Dog[] dogs = new Dog[3];
        dogs[0] = dog1;
        dogs[1] = dog2;
        dogs[2] = dog3;

        for (Dog d : dogs){
            d.howling();
        }

        //Windowクラスのオブジェクトを作り
        //このメインクラスからheightとwedhtを変更できるようにする


    }
}
