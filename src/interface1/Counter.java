package interface1;

public class Counter implements Attack{

    @Override
    public void action() {
        System.out.println("カウンターする");
    }
}
