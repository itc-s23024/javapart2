package Sammple1;

public class Person {
    //feedメソッドを作る
    public void feed(Animal animal){
       animal.eat();

       //犬のときは散歩させる
        if (animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.walk();
            //animal.walk();

            //((Dog) animal).walk();
        }
    }
}
