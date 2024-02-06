package Sammple1;


//抽象クラスと抽象メソッド
//このAnimalクラスを抽象クラスにする
//makeSoundという抽象メソッドをつくる
public abstract class Animal {
    public void eat(){
        System.out.println("動物が餌を食べる");
    }
    public abstract void makeSound();
}
