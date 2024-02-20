package interface1;

public class Guard implements Attack{
    @Override
    public void action() {
        System.out.println("守る");
    }
}
