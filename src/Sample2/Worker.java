package Sample2;

public abstract class Worker {
    protected int workTime;  //労働時間

    protected int income;

    public int getIncome(){
        return income;
    }

    public abstract void calcIncome();
}
