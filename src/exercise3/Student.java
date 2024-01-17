package exercise3;

import java.util.ArrayList;

public class Student {
    //フィールド private
    //名前
    //学年　1,2,3のどれか
    private String name;
    private int grade;
    private ArrayList<String> courses;


    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    //Mike
    //3


    //MainクラスでStudentオブジェクトを作り、
    //各フィールドの値を書き換えたり参照できるようにする

    //次のお題
    //コース　数字、英語、国語、理科、社会のうち複数
    //受講しているコースの数はわからない（固定ではない）
    //コース追加はコンストラクタではなく、メソッドを作ること
    //引数にコース名を設定(1教科ずつ追加)

    public void tuika(String kyoka){
        courses.add(kyoka);
    }


}
