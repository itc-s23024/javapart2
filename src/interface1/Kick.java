package interface1;

public class Kick implements Attack{
    @Override
    public void action() {
        System.out.println("キックする");
    }
}
