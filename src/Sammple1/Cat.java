package Sammple1;

public class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫が餌を食べる");
    }

    @Override
    public void makeSound() {
        System.out.println("ミャーオ");
    }
}
