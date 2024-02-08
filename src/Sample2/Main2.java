package Sample2;

public class Main2 {
    public static void main(String[] args) {
        //高校生と大学生を誕生させる

        //コンストラクタの引数に授業回数を指定する
        HighSchoolStudent hs = new HighSchoolStudent(5);
        UniversityStudent us = new UniversityStudent(3,2);

        //Studentクラス型の配列に高校生と大学生のオブジェクトを入れる
        Student[] students = new Student[2];
        students[0] = new HighSchoolStudent(5);
        students[1] = new UniversityStudent(3, 2);

        for (Student s : students) {
            //calcLessonTimeメソッドを実行する
            s.calcLessonTime();
             /*
        高校生: 4時間10分
        大学生: 4時間30分
         */
            if (s instanceof HighSchoolStudent){
                System.out.println("高校生");
            }
            if (s instanceof UniversityStudent){
                System.out.println("大学生");
            }

            //lessonTimeの値を表示する
            //〇時間〇分と表示する
            System.out.print(hs.getLessonTime() / 60 + "時間");
            System.out.println(hs.getLessonTime() % 60 + "分");

            System.out.print(s.getLessonTime() / 60 + "時間");
            System.out.println(s.getLessonTime() % 60 + "分");

            //大学生の場合のみ、給与を表示する
            //労働時間はUniversityStudentのコンストラクタの引数で設定する
            //時給は1100円
            if (s instanceof UniversityStudent) {
                UniversityStudent u = (UniversityStudent) s;
                u.calcIncome();
                System.out.println(u.getIncome() + "円");
            }

        }
    }
}