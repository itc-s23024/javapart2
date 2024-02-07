package Sample2;

public  abstract class Student {
    protected int lessonTime; //授業時間
    protected int lessonCount; //授業回数

    public int getLessonTime(){
        return lessonTime;
    }

    //授業時間を算出して、lessonTimeに代入する
    //高校生の場合、１コマ50分
    //大学生の場合、１コマ90分
    //授業回数で掛けて、授業時間を求める
    public abstract void calcLessonTime();
}
