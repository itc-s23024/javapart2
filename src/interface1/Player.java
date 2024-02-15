package interface1;

public abstract class Player {
    //public abstract void fight();
    Attack attack;

    public void setAttack(Attack at){
        this.attack = at;
    }

    public void fight(){
        attack.action();
    }
}
