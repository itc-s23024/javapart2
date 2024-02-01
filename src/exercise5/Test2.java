package exercise5;

/*
I am walking
I am flying
I am singing
出力結果が上のようになるようにBirdクラスに新しいメソッドを作る
 */
public class Test2 {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
    }
}
class Animal2{
    void walk(){
        System.out.println("I am walking");
    }
}
class Bird extends  Animal2{
    void fly(){
        System.out.println("I am flying");
    }


}