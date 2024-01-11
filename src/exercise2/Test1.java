package exercise2;

public class Test1 {
    public static void main(String[] args) {

        //クラスを作る　(ジャンルは問わない)
        //１つ以上もメソッドを入れてください
        hello();



        //hello2メソッド　(staticでないメソッド)を呼び出す
        Test1 t = new Test1();
        t.hello2();

        //１台目
        Car c = new Car();
        c.accelerate();
        Car.count();
        c.show();

        //2台目
        Car c2 = new Car();
        c2.accelerate();
        Car.count();
        c2.show();

    }

    //クラスメソッド
    public static void hello(){
        System.out.println("hello");
    }

    //インスタンスメソッド
    public void hello2(){
        System.out.println("こんにちは");
    }
}
