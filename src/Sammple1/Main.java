package Sammple1;

public class Main {
    public static void main(String[] args) {
        //Dog dog = new Dog();
        //Animal animal = dog;
        //animal.eat();

        Person person = new Person();

        Dog dog = new Dog();
        Cat cat = new Cat();

        person.feed(dog);
        person.feed(cat);

        //犬と猫　あわせて5匹誕生させ、makeSoundメソッドを実行する
        //できるだけ,短いコードで書いてください

    }
}
