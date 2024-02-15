package interface1;

public class Punch implements Attack{
    @Override
    public void action() {
        System.out.println("パンチする");
    }
}
