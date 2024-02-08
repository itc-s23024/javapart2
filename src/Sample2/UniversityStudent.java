package Sample2;

public class UniversityStudent extends Student implements Work{
    protected int workTime;  //労働時間
    protected int income;  //給与

    public UniversityStudent(int count, int wt){
        lessonCount = count;
        workTime = wt;
    }

    //授業
    @Override
    public void calcLessonTime() {
        lessonTime = lessonCount * 90;
    }

    //労働
    public void calcIncome(){
        income = 1100 * workTime;
    }

    public int getIncome(){
        return income;
    }
}


