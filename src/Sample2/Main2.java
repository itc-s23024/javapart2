package Sample2;

public class Main2 {
    public static void main(String[] args) {
        //高校生と大学生を誕生させる

        //コンストラクタの引数に授業回数を指定する
        HighSchoolStudent hs = new HighSchoolStudent(5);
        UniversityStudent us = new UniversityStudent(3);

        //calcLessonTimeメソッドを実行する
        hs.calcLessonTime();
        us.calcLessonTime();

        //lessonTimeの値を表示する
        //〇時間〇分と表示する
        System.out.println(hs.getLessonTime());
        System.out.println(us.getLessonTime());
    }
}
