package exercise2;

public class Car {
    double speed =0.0;
    static int total = 0;

    //加速するメソッド
    public void accelerate(){
        speed += 1.0;
    }

    //車の数を足していくメソッド
    public static void count(){
        total++;
    }

    //表示するメソッド
    public void show(){
        System.out.println("speed" + speed);
        System.out.println("total" + total);
    }
}
