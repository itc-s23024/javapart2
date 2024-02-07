package Sample2;

public class HighSchoolStudent extends Student {

    public HighSchoolStudent(int count){
        lessonCount = count;
    }

    @Override
    public void calcLessonTime() {
        //授業時間を算出して、lessonTimeに代入する
        //高校生の場合、１コマ50分
        //授業回数で掛けて、授業時間を求める
        lessonTime = lessonCount * 50;
    }
}
