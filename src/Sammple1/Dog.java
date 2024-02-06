package Sammple1;

public class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("犬が餌を食べる");
    }

    @Override
    public void makeSound() {
        System.out.println("バウ！");
    }

    public void walk(){
        System.out.println("犬が散歩する");
    }
}
